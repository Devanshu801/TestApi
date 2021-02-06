package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Comment {

	@Id
	private int id;
	@Column
	private String comment;
	@Column
	private int commentdate;
	@Column
	private int commentupdated;
	@Column
	private int commentcreated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCommentdate() {
		return commentdate;
	}
	public void setCommentdate(int commentdate) {
		this.commentdate = commentdate;
	}
	public int getCommentupdated() {
		return commentupdated;
	}
	public void setCommentupdated(int commentupdated) {
		this.commentupdated = commentupdated;
	}
	public int getCommentcreated() {
		return commentcreated;
	}
	public void setCommentcreated(int commentcreated) {
		this.commentcreated = commentcreated;
	}
	
	
}
