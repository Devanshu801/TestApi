package com.craterzone.demo.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.craterzone.demo.model.User;



@Entity
@Table(name="address")
public class AddressDao {
@Id
private int id;
@Column
private int house_no;
@Column
private String street;
@Column
private String area;
@Column
private String landmark;
@Column
private String city;
@Column
private String state;
@Column
private String country_code;
@Column
private String pincode;
@Column
private long created;
@Column
private long updated;

@OneToOne(mappedBy = "address")
 private UserDao user;
public AddressDao(int id, int house_no, String street, String area, String landmark, String city, String state,
		String country_code, String pincode, long created, long updated) {
	super();
	this.id = id;
	this.house_no = house_no;
	this.street = street;
	this.area = area;
	this.landmark = landmark;
	this.city = city;
	this.state = state;
	this.country_code = country_code;
	this.pincode = pincode;
	this.created = created;
	this.updated = updated;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getHouse_no() {
	return house_no;
}
public void setHouse_no(int house_no) {
	this.house_no = house_no;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getLandmark() {
	return landmark;
}
public void setLandmark(String landmark) {
	this.landmark = landmark;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry_code() {
	return country_code;
}
public void setCountry_code(String country_code) {
	this.country_code = country_code;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
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
public UserDao getUser() {
	return user;
}
public void setUser(UserDao user) {
	this.user = user;
}
@Override
public String toString() {
	return "AddressDao [id=" + id + ", house_no=" + house_no + ", street=" + street + ", area=" + area + ", landmark="
			+ landmark + ", city=" + city + ", state=" + state + ", country_code=" + country_code + ", pincode="
			+ pincode + ", created=" + created + ", updated=" + updated + "]";
}
}
