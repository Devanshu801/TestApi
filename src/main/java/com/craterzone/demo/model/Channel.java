package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Channel {
	@Id
	private int channelid;
	@Column
	private String channelname;
	@Column
	private String channelcategory;
	@Column
	private int numberofsubscribers;
	@Column
	private int channelcreated;
	@Column
	private int channelupdated;
	public int getChannelid() {
		return channelid;
	}
	public void setChannelid(int channelid) {
		this.channelid = channelid;
	}
	public String getChannelname() {
		return channelname;
	}
	public void setChannelname(String channelname) {
		this.channelname = channelname;
	}
	public String getChannelcategory() {
		return channelcategory;
	}
	public void setChannelcategory(String channelcategory) {
		this.channelcategory = channelcategory;
	}
	public int getNumberofsubscribers() {
		return numberofsubscribers;
	}
	public void setNumberofsubscribers(int numberofsubscribers) {
		this.numberofsubscribers = numberofsubscribers;
	}
	public int getChannelcreated() {
		return channelcreated;
	}
	public void setChannelcreated(int channelcreated) {
		this.channelcreated = channelcreated;
	}
	public int getChannelupdated() {
		return channelupdated;
	}
	public void setChannelupdated(int channelupdated) {
		this.channelupdated = channelupdated;
	}
	

}
