package com.craterzone.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.model.Playlist;
import com.craterzone.demo.repositry.PlaylistRepositry;

@Service
public class PlaylistService {

	
	@Autowired
	PlaylistRepositry playlistRepositry;
	
	public List<Playlist> getallplaylists()
	{
		List<Playlist> playlist = new ArrayList<Playlist>();
		playlistRepositry.findAll().forEach(playlist1->playlist.add(playlist1));
		return playlist;
	}

	public Playlist getPlaylistById(int id)
	{
	 return playlistRepositry.findById(id).get();
	}
	public void saveOrUpdate(Playlist playlist)
	{
	playlistRepositry.save(playlist);
	}
	
	public void delete(int id) {
		playlistRepositry.deleteById(id);
	}
	public void update(Playlist playlist,int playlistid)
	{
		playlistRepositry.save(playlist);
	}
}
