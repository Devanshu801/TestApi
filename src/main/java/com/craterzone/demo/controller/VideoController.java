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
import com.craterzone.demo.model.Video;
import com.craterzone.demo.service.VideoService;

@RestController
public class VideoController {

	
	@Autowired
	VideoService videoservice;
	
	@GetMapping("/video")
	private List<Video> getAllvideo()
	{
		return videoservice.getallvideos();
		
	}

	@GetMapping("/video/{videoid}")
	private Video getVideo(@PathVariable("videoid") int videoid)
		{
			return videoservice.getVideoById(videoid);
			
		}
	@DeleteMapping("/video/{videoid}")
	private void deletevideo(@PathVariable("videoid") int videoid)
	{
	videoservice.delete(videoid);
	}
	
	@PostMapping("/video")
	private int saveVideo(@RequestBody Video video)
	{
		videoservice.saveOrUpdate(video);
		return video.getId();
	}
	
	@PutMapping("/video")
	private Video update(@RequestBody Video video)
	{
		videoservice.saveOrUpdate(video);
		return video;
	}
}