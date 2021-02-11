package com.craterzone.demo.model;

import javax.persistence.Id;



public class Address {

@Id
private int id;
private int house_no;
private String street;
private String area;
private String landmark;
private String city;
private String state;
private String country_code;
private String pincode;
private long created;
private long updated;
private User userid;



public Address(int id, int house_no, String street, String area, String landmark, String city, String state,
		String country_code, String pincode, long created, long updated, User userid) {
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
	this.userid = userid;
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
public User getUserid() {
	return userid;
}
public void setUserid(User userid) {
	this.userid = userid;
}
@Override
public String toString() {
	return "Address [id=" + id + ", house_no=" + house_no + ", street=" + street + ", area=" + area + ", landmark="
			+ landmark + ", city=" + city + ", state=" + state + ", country_code=" + country_code + ", pincode="
			+ pincode + ", created=" + created + ", updated=" + updated + ", userid=" + userid + "]";
}


}
