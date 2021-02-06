package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {

@Id
	private int userid;
@Column
	private  String firstname;
@Column
	private String lastname;
@Column	
private int DOB;
@Column	

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
		return userid;
	}

	public void setUser_id(int userid) {
		this.userid = userid;
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
