package com.craterzone.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.model.Subscriber;
import com.craterzone.demo.repositry.SubscriberRepositry;



@Service
public class SubscriberService {

	@Autowired
	SubscriberRepositry subscriberRepositry;
	
	public List<Subscriber> getAllsubscribers()
	{
		List<Subscriber> subscriber = new ArrayList<Subscriber>();
		subscriberRepositry.findAll().forEach(subscriber1->subscriber.add(subscriber1));
		return subscriber;
	}

	public Subscriber getSubscriberById(int id)
	{
	 return subscriberRepositry.findById(id).get();
	}
	public void saveOrUpdate(Subscriber subscriber)
	{
	subscriberRepositry.save(subscriber);
	}
	
	public void delete(int id) {
		subscriberRepositry.deleteById(id);
	}
	public void update(Subscriber subscriber,int subscriberid)
	{
		subscriberRepositry.save(subscriber);
	}
}
