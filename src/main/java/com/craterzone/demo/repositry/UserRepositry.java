package com.craterzone.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.craterzone.demo.model.User;

public interface UserRepositry extends CrudRepository<User,Integer>
{

}
