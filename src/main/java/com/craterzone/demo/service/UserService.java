package com.craterzone.demo.service;

import org.springframework.stereotype.Service;

import com.craterzone.demo.model.User;


@Service
public class UserService {

public static User register() {
	return new User("Devanshu","Bansal", 0, null, null, 0, 0, null);
}
public static User login() {
	return new User("JAi","Ho", 0, null, null, 0, 0, null);
}
}
