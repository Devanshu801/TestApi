package com.craterzone.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.craterzone.demo.model.Channel;

public interface ChannelRepositry extends CrudRepository<Channel,Integer> {

}
