package com.craterzone.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class UserDao {
	
	@Id
	private int id;
	
	@Column(name = "first_name")
	private  String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column	(name = "date_of_birth")
	private int dateOfBirth;
	
	@Column	(name = "email")
	private String email;
	
	@Column
	private  String address;
	
	@Column
	private  long created;
	
	@Column
	private  long updated;
	
	@Column
	private  String password;
		
}
