package com.craterzone.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.model.User;
import com.craterzone.demo.repositry.UserRepositry;


@Service
public class UserService {

	@Autowired
	UserRepositry userRepositry;
	
	public Optional<User> getallusers(int userid)
	{
		Optional<User> get = userRepositry.findByUserid(userid);
		return get;
	}
	public User getUserById(int id)
	{
	 return userRepositry.findById(id).get();
	}
	public User saveOrUpdate(User user)
	{
	return userRepositry.save(user);
	}
	
	public boolean delete(int id) {
		return userRepositry.existsById(id);
	}
	public User update(User user,int userid)
	{
		return userRepositry.save(user);
	}

	
}
