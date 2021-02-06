package com.craterzone.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.craterzone.demo.model.Playlist;



public interface PlaylistRepositry extends CrudRepository<Playlist,Integer> {

}
