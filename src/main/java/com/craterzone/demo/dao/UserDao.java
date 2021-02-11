package com.craterzone.demo.dao;

import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyTemporal;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import com.craterzone.demo.model.Address;
import com.craterzone.demo.model.User;




@Entity
@Table(name="users")
public class UserDao {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
@Column
@Size(min=3,max=30)
	private   String firstName;
@Column
	private String last_name;
@Column	
@MapKeyTemporal(TemporalType.DATE)
@DateTimeFormat(pattern = "dd/MM/yyyy")
private long date_of_birth;

@Column(unique = true)
@javax.validation.constraints.Email
private  String email;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "id", referencedColumnName = "id")
  private  AddressDao address;
@Column
	private  long created;
@Column
	private  long updated;
@Column
	private  String emailpassword;


public UserDao() {
	super();
}

public UserDao(int id, @NotBlank @Size(min = 3, max = 30) String first_name, String last_name, long date_of_birth,
		@Email String email, AddressDao address, long created, long updated, String emailpassword) {
	super();
	this.id = id;
	this.firstName = first_name;
	this.last_name = last_name;
	this.date_of_birth = date_of_birth;
	this.email = email;
	 this.address = address;
	this.created = created;
	this.updated = updated;
	this.emailpassword = emailpassword;
}


 public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
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

public AddressDao getAddress() {
	return address;
}

public void setAddress(AddressDao address) {
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

public String toString() {
	return "UserDao [id=" + id + ", first_name=" + firstName + ", last_name=" + last_name + ", date_of_birth="
			+ date_of_birth + ", email=" + email + ", address=" + address + ", created=" + created + ", updated="
			+ updated + ", emailpassword=" + emailpassword + "]";
}
		
}
