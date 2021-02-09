package com.craterzone.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.craterzone.demo.model.User;
import com.craterzone.demo.repositry.UserRepositry;


@Service
public class UserService {

	@Autowired
	UserRepositry userRepositry;
	
	public List<User> getAllUsers(){
		return (List<User>) userRepositry.findAll();
	}
	
	public Optional<User> getUserById(int id){
		Optional<User> userid = userRepositry.findById(id);
			if(userid.isPresent()) {
				return userRepositry.findById(id);
		}
			return Optional.empty();
		
	}
	
	
	public User registerUser(User user){
		//check if exists
		
		return userRepositry.save(user);
	}
	
	public boolean delete(int id) {
		return userRepositry.existsById(id);
	}
	
	
	public User updateUser(User user){
		//check if user exists
		return userRepositry.save(user);
	}

	
}
