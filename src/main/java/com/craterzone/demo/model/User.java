package com.craterzone.demo.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.springframework.lang.NonNull;


public class User {

@Id
	private int id;
@Column
@NotBlank
@Size(min=3,max=30)
	private  String firstName;
@Column
	private String last_name;
@Column	
private long date_of_birth;


private String email;

 private  Address address;
@Column
	private  long created;
@Column
	private  long updated;
@Column
@NonNull
	private  String emailpassword;

public User( @NotBlank @Size(min = 3, max = 30) String first_name, String last_name, long date_of_birth,
		String email, Address address, long created, long updated, String emailpassword) {
	super();
	this.firstName = first_name;
	this.last_name = last_name;
	this.date_of_birth = date_of_birth;
	this.email = email;
	this.address = address;
	this.created = created;
	this.updated = updated;
	this.emailpassword = emailpassword;
}
public User() {
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirst_name() {
	return firstName;
}
public void setFirst_name(String first_name) {
	this.firstName = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public long getDate_of_birth() {
	return date_of_birth;
}
public void setDate_of_birth(long date_of_birth) {
	this.date_of_birth = date_of_birth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
 public Address getAddress() {
	return address;
 }
public void setAddress(Address address) {
	this.address = address;
}

public long getCreated() {
	return created;
}
public void setCreated(long created) {
	this.created = created;
}
public long getUpdated() {
	return updated;
}
public void setUpdated(long updated) {
	this.updated = updated;
}
public String getEmailpassword() {
	return emailpassword;
}
public void setEmailpassword(String emailpassword) {
	this.emailpassword = emailpassword;
}	
}
