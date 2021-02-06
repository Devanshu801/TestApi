package com.craterzone.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.craterzone.demo.model.Video;



public interface VideoRepositry extends CrudRepository<Video,Integer> {

}
