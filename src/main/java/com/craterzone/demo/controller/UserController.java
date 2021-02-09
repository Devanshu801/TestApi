package com.craterzone.demo.controller;


import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
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
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	private  ResponseEntity<List<User>> getAllUser(){
		List<User> users = userService.getAllUsers();	
		return CollectionUtils.isEmpty(users) ?  ResponseEntity.noContent().build() :  ResponseEntity.status(HttpStatus.OK).body(users);
	}
	
	@GetMapping("{userid}")
	private ResponseEntity<User>getUser(@PathVariable("userid") int userid){
		Optional<User> id1 = userService.getUserById(userid);
		if(id1.isPresent()) {
			return new ResponseEntity<User>(HttpStatus.OK);
		}
		else
			return new ResponseEntity <User>(HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("{user_id}")
	private ResponseEntity<User> deleteUser(@PathVariable("userid") int userid){
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("{user_id}")
	private ResponseEntity<User> update(@PathVariable("userid") @RequestBody User user){
		userService.registerUser(user);
		return new ResponseEntity<User>(userService.registerUser(user),HttpStatus.OK);
	}
	
	
	@PostMapping("")
	private ResponseEntity<User> saveuser(@RequestBody User user){
		userService.updateUser(user);
		return new ResponseEntity<User>(userService.updateUser(user),HttpStatus.CREATED);	
	}
}




