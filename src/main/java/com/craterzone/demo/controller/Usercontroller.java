package com.craterzone.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.craterzone.demo.model.User;
import com.craterzone.demo.service.UserService;

@RestController
public class Usercontroller {

	@Autowired
	UserService userservice;
	
	@PostMapping (value = "/user/login")
	public  User login() {
		if(UserService.login()!=null){
			return UserService.login();
		}
		else 
		{
			return null;
		}
	}
	
	@PostMapping("/user")
	public ResponseEntity<User> User(){
		return new ResponseEntity<>(UserService.register(),HttpStatus.CREATED);
		
	}

}
