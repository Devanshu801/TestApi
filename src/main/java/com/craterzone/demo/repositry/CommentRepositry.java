package com.craterzone.demo.repositry;

import org.springframework.data.repository.CrudRepository;

import com.craterzone.demo.model.Comment;




public interface CommentRepositry extends CrudRepository<Comment,Integer> {

}
