package com.craterzone.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.model.User;
import com.craterzone.demo.repositry.UserRepositry;


@Service
public class UserService {

	@Autowired
	UserRepositry userRepositry;
	
	
	public List<User> getallusers()
	{
		List<User> user = new ArrayList<User>();
		userRepositry.findAll().forEach(user1->user.add(user1));
		return user;
	}

	public User getUserById(int id)
	{
	 return userRepositry.findById(id).get();
	}
	public void saveOrUpdate(User user)
	{
	userRepositry.save(user);
	}
	
	public void delete(int id) {
		userRepositry.deleteById(id);
	}
	public void update(User user,int userid)
	{
		userRepositry.save(user);
	}
}
