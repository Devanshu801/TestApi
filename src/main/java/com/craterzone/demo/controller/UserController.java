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
	
	@GetMapping("{id}")
	private ResponseEntity<User>getUser(@PathVariable("id") int userId){
		Optional<User> user = userService.getUserById(userId);
		if(user.isPresent()) {
			return new ResponseEntity<User>(HttpStatus.OK);
		}
			return new ResponseEntity <User>(HttpStatus.BAD_REQUEST);
	}
	@DeleteMapping("{id}")
	private ResponseEntity<User> deleteUser(@PathVariable("id") int userid){
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	private ResponseEntity<User> updateUser(@PathVariable("id") @RequestBody User user){
		userService.updateUser(user);
		if(user != null) {
			return new ResponseEntity<User>(userService.updateUser(user),HttpStatus.OK);
		}
		return new ResponseEntity<User>(HttpStatus.NOT_ACCEPTABLE);
	}
	
	@PostMapping("")
	private ResponseEntity<User> registerUser(@RequestBody User user){
		userService.registerUser(user);
		if(user != null) {
			return new ResponseEntity<User>(userService.registerUser(user),HttpStatus.CREATED);	
		}
		return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
	}
}




