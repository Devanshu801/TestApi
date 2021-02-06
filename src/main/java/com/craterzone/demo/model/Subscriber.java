package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Subscriber {

	@Id
	private int id;
	@Column
	private String subscribername;
	@Column
	private int subscribertime;
	@Column
	private int subscribercreated;
	@Column
	private int subscriberupdated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubscribername() {
		return subscribername;
	}
	public void setSubscribername(String subscribername) {
		this.subscribername = subscribername;
	}
	public int getSubscribertime() {
		return subscribertime;
	}
	public void setSubscribertime(int subscribertime) {
		this.subscribertime = subscribertime;
	}
	public int getSubscribercreated() {
		return subscribercreated;
	}
	public void setSubscribercreated(int subscribercreated) {
		this.subscribercreated = subscribercreated;
	}
	public int getSubscriberupdated() {
		return subscriberupdated;
	}
	public void setSubscriberupdated(int subscriberupdated) {
		this.subscriberupdated = subscriberupdated;
	}
	
	
}
