package com.craterzone.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.craterzone.demo.model.Video;
import com.craterzone.demo.repositry.VideoRepositry;

@Service
public class VideoService {

	
	@Autowired
	VideoRepositry videoRepositry;
	
	public List<Video> getallvideos()
	{
		List<Video> video = new ArrayList<Video>();
		videoRepositry.findAll().forEach(video1->video.add(video1));
		return video;
	}

	public Video getVideoById(int id)
	{
	 return videoRepositry.findById(id).get();
	}
	public void saveOrUpdate(Video video)
	{
	videoRepositry.save(video);
	}
	
	public void delete(int id) {
		videoRepositry.deleteById(id);
	}
	public void update(Video video,int videoid)
	{
		videoRepositry.save(video);
	}
	
}
