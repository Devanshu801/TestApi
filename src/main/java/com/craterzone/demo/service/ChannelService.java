package com.craterzone.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.model.Channel;
import com.craterzone.demo.repositry.ChannelRepositry;

@Service
public class ChannelService {

	
	@Autowired
	ChannelRepositry channelRepositry;
	public List<Channel> getallchannels()
	{
		List<Channel> channel = new ArrayList<Channel>();
		channelRepositry.findAll().forEach(channel1->channel.add(channel1));
		return channel;
	}
	
	public Channel getChannelById(int id)
	{
	 return channelRepositry.findById(id).get();
	}
	public void saveOrUpdate(Channel channel)
	{
	channelRepositry.save(channel);
	}
	
	public void delete(int id) {
		channelRepositry.deleteById(id);
	}
	public void update(Channel channel,int channelid)
	{
		channelRepositry.save(channel);
	}
}
