package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Video {

	@Id
	private int id;
	@Column
	private String title;
	@Column
	private int size;
	@Column
	private String description;
	@Column
	private String category;
	@Column
	private String video;
	@Column
	private String numberoflikes;
	@Column
	private String numberofdislikes;
	@Column
	private int uploadedtime;
	@Column
	private int numberofcreateddate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getNumberoflikes() {
		return numberoflikes;
	}
	public void setNumberoflikes(String numberoflikes) {
		this.numberoflikes = numberoflikes;
	}
	public String getNumberofdislikes() {
		return numberofdislikes;
	}
	public void setNumberofdislikes(String numberofdislikes) {
		this.numberofdislikes = numberofdislikes;
	}
	public int getUploadedtime() {
		return uploadedtime;
	}
	public void setUploadedtime(int uploadedtime) {
		this.uploadedtime = uploadedtime;
	}
	public int getNumberofcreateddate() {
		return numberofcreateddate;
	}
	public void setNumberofcreateddate(int numberofcreateddate) {
		this.numberofcreateddate = numberofcreateddate;
	}
	
	
	
	
}
