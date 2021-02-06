package com.craterzone.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Playlist {

	@Id
	private int id;
	@Column
	private String playlistname;
	@Column
	private String playlisttype;
	@Column
	private int created;
	@Column
	private int updated;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaylistname() {
		return playlistname;
	}
	public void setPlaylistname(String playlistname) {
		this.playlistname = playlistname;
	}
	public String getPlaylisttype() {
		return playlisttype;
	}
	public void setPlaylisttype(String playlisttype) {
		this.playlisttype = playlisttype;
	}
	public int getCreated() {
		return created;
	}
	public void setCreated(int created) {
		this.created = created;
	}
	public int getUpdated() {
		return updated;
	}
	public void setUpdated(int updated) {
		this.updated = updated;
	}
}
