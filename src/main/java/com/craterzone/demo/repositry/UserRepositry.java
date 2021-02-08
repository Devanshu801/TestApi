package com.craterzone.demo.repositry;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.craterzone.demo.model.User;

public interface UserRepositry extends CrudRepository<User,Integer>
{
	Optional<User> findByUserid(int userid);

}
