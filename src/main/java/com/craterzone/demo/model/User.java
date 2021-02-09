package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table
public class User {

@Id
	private int id;
@Column
@NotBlank
@Size(min=3,max=30)
	private  String firstname;
@Column
	private String lastname;
@Column	
private int DOB;

@Column(unique = true)
@javax.validation.constraints.Email
private String Email;
@Column
private  String Address;
@Column
	private  int created;
@Column
	private  int updated;
@Column
	private  String Emailpassword;
	


	public int getUserid() {
		return id;
	}

	public void setUser_id(int userid) {
		 this.id = userid;
	}

	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getDOB() {
		return DOB;
	}
	public String getEmail() {
		return Email;
	}
	public String getAddress() {
		return Address;
	}
	public int getCreated() {
		return created;
	}
	public int getUpdated() {
		return updated;
	}
	public String getEmailpassword() {
		return Emailpassword;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLast_name(String lastname) {
		this.lastname = lastname;
	}
	public void setDOB(int dOB) {
		DOB = dOB;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setCreated(int created) {
		this.created = created;
	}
	public void setUpdated(int updated) {
		this.updated = updated;
	}
	public void setEmailpassword(String emailpassword) {
		Emailpassword = emailpassword;
	}
}
