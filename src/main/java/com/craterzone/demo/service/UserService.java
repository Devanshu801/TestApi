package com.craterzone.demo.service;



import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.dao.AddressDao;
import com.craterzone.demo.dao.UserDao;
import com.craterzone.demo.mapper.UserMapper;
import com.craterzone.demo.model.User;
import com.craterzone.demo.repositry.UserRepositry;

@Service
public class UserService {

	@Autowired UserRepositry userRepositry;

	public Optional<User> getUserById(User user){
		Optional<UserDao> userid = userRepositry.findByfirstName(user.getFirst_name());
			if(userid.isPresent()) {
				return null;
	}
			UserDao userDao = UserMapper.UserToUserDao(user);
			AddressDao addressDao = userDao.getAddress();
			userDao = userRepositry.saveAndFlush(userDao);
			return Optional.of(user);
	 }

	public Optional<User> registerUser(User user){
		Optional<UserDao> userExists = userRepositry.findByEmail(user.getEmail());
		if(userExists.isPresent()) {
			return null;
		}
			UserDao userDao = UserMapper.UserToUserDao(user);
			AddressDao addressDao = userDao.getAddress();
			addressDao.setUser(userDao);
			userDao = userRepositry.save(userDao);

		return Optional.of(user);	
	}
	public boolean delete(int userid) {
		return userRepositry.existsById(userid);
	}
	
	public User updateUser(User user){
		UserDao userDao = UserMapper.UserToUserDao(user);
		 userRepositry.save(userDao);
		 return user;
	}
/*
	public List<UserDao> getAllUsers(User user) {
		return userMapper.UserToUserDao(user);
	}
*/
}
