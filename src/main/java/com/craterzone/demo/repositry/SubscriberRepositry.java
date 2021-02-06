package com.craterzone.demo.repositry;

import org.springframework.data.repository.CrudRepository;


import com.craterzone.demo.model.Subscriber;

public interface SubscriberRepositry extends CrudRepository<Subscriber,Integer>  {

}
