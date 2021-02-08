package com.craterzone.demo.controller;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.craterzone.demo.model.User;
import com.craterzone.demo.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class Usercontroller {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	private  ResponseEntity<User> getAllUser(int userid)
	{
		
		Optional<User> users = userService.getallusers(userid);
		
		if(users.isPresent()) {
			return ResponseEntity.status(HttpStatus.OK).body(users.get());
		}
		return ResponseEntity.badRequest().build();	
	}
	
	@GetMapping("{userid}")
	private ResponseEntity<User> getUser(@PathVariable("userid") int userid)
		{
			return new ResponseEntity<User>(userService.getUserById(userid),HttpStatus.OK);
	
		}
	@DeleteMapping("{userid}")
	private ResponseEntity<User> deleteUser(@PathVariable("userid") int userid)
		{
	
	return new ResponseEntity<User>(HttpStatus.OK);
		}
	@PutMapping("{userid}")
	private ResponseEntity<User>  update(@PathVariable("userid") @RequestBody User user)
		{
		userService.saveOrUpdate(user);
		return new ResponseEntity<User>(userService.saveOrUpdate(user),HttpStatus.OK);
		}
	@PostMapping("")
	private ResponseEntity<User> saveuser(@RequestBody User user)
		{
	userService.saveOrUpdate(user);
	return new ResponseEntity<User>(userService.saveOrUpdate(user),HttpStatus.CREATED);	
		}
}




