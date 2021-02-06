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

import com.craterzone.demo.model.Comment;
import com.craterzone.demo.service.CommentService;

@RestController
public class CommentController {

	
	@Autowired
	CommentService commentservice;
	
	
	@GetMapping("/comment")
	private List<Comment> getAllcomment()
	{
		return commentservice.getallcomment();
		
	}

	@GetMapping("/comment/{commentid}")
	private Comment getComment(@PathVariable("commentid") int commentid)
		{
			return commentservice.getCommentById(commentid);
			
		}
	@DeleteMapping("/comment/{commentid}")
	private void deleteUser(@PathVariable("commentid") int commentid)
	{
	commentservice.delete(commentid);
	}
	
	@PostMapping("/comment")
	private int saveComment(@RequestBody Comment comment)
	{
		commentservice.saveOrUpdate(comment);
		return comment.getId();
	}
	
	@PutMapping("/comment")
	private Comment update(@RequestBody Comment comment)
	{
		commentservice.saveOrUpdate(comment);
		return comment;
	}
}
