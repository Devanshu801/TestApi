package com.craterzone.demo.model;

public class User {

	
	
	private  String first_name;
	private String last_name;
	private int DOB;
	private String Email;
	private  String Address;
	private  int created;
	private  int updated;
	private  String Email_password;
	
	public User(String first_name, String last_name, int dOB, String email, String address, int created, int updated,
			String email_password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		DOB = dOB;
		Email = email;
		Address = address;
		this.created = created;
		this.updated = updated;
		Email_password = email_password;
	}
	public String getFirst_name() {
		return first_name;
	}
	public String getLast_name() {
		return last_name;
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
	public String getEmail_password() {
		return Email_password;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
	public void setEmail_password(String email_password) {
		Email_password = email_password;
	}
	@Override
	public String toString() {
		return "User [first_name=" + first_name + ", last_name=" + last_name + ", DOB=" + DOB + ", Email=" + Email
				+ ", Address=" + Address + ", created=" + created + ", updated=" + updated + ", Email_password="
				+ Email_password + "]";
	}	
	

}
