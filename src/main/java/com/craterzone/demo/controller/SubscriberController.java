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

import com.craterzone.demo.model.Subscriber;

import com.craterzone.demo.service.SubscriberService;

@RestController
public class SubscriberController {

	@Autowired
	SubscriberService subscriberservice;
	

	@GetMapping("/subscriber")
	private List<Subscriber> getAllsubscriber()
	{
		return subscriberservice.getAllsubscribers();
		
	}

	@GetMapping("/subscriber/{subscriberid}")
	private Subscriber getSubscriber(@PathVariable("subscriberid") int subscriberid)
		{
			return subscriberservice.getSubscriberById(subscriberid);
		}
	@DeleteMapping("/subscriber/{subscriberid}")
	private void deleteSubscriber(@PathVariable("subscriberid") int subscriberid)
	{
	subscriberservice.delete(subscriberid);
	}
	
	@PostMapping("/subscriber")
	private int saveSubscriber(@RequestBody Subscriber subscriber)
	{
		subscriberservice.saveOrUpdate(subscriber);
		return subscriber.getId();
	}
	
	@PutMapping("/subscriber")
	private Subscriber update(@RequestBody Subscriber subscriber)
	{
		subscriberservice.saveOrUpdate(subscriber);
		return subscriber;
	}
}
