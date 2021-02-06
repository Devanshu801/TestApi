package com.craterzone.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.craterzone.demo.model.Playlist;
import com.craterzone.demo.service.PlaylistService;

@RestController
public class PlaylistController {

	@Autowired
	PlaylistService playlistservice;
	
	@GetMapping("/playlist")
	private List<Playlist> getAllplaylist()
	{
		return playlistservice.getallplaylists();
		
	}

	@GetMapping("/playlist/{playlistid}")
	private Playlist getPlaylist(@PathVariable("playlistid") int playlistid)
		{
			return playlistservice.getPlaylistById(playlistid);
		}
	@DeleteMapping("/playlist/{playlistid}")
	private void deleteChannel(@PathVariable("playlistid") int playlistid)
	{
		playlistservice.delete(playlistid);
	}
	
	@PostMapping("/playlist")
	private int savePlaylist(@RequestBody Playlist playlist)
	{
		playlistservice.saveOrUpdate(playlist);
		return playlist.getId();
				}
	
	@PutMapping("/playlist")
	private Playlist update(@RequestBody Playlist playlist)
	{
		playlistservice.saveOrUpdate(playlist);
		return playlist;
	}
	
}
