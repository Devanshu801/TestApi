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

import com.craterzone.demo.model.Channel;
import com.craterzone.demo.service.ChannelService;


@RestController
public class ChannelController {

	
	
	@Autowired
	ChannelService channelservice;

	
	@GetMapping("/channel")
	private List<Channel> getAllchannel()
	{
		return channelservice.getallchannels();
		
	}

	@GetMapping("/channel/{channelid}")
	private Channel getChannel(@PathVariable("channelid") int channelid)
		{
			return channelservice.getChannelById(channelid);
		}
	@DeleteMapping("/channel/{channelid}")
	private void deleteChannel(@PathVariable("channelid") int channelid)
	{
	channelservice.delete(channelid);
	}
	
	@PostMapping("/channel")
	private int saveChannel(@RequestBody Channel channel)
	{
		channelservice.saveOrUpdate(channel);
		return channel.getChannelid();
	}
	
	@PutMapping("/channel")
	private Channel update(@RequestBody Channel channel)
	{
		channelservice.saveOrUpdate(channel);
		return channel;
	}
}
