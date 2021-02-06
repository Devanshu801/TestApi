package com.craterzone.demo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.craterzone.demo.model.Comment;
import com.craterzone.demo.repositry.CommentRepositry;

@Service
public class CommentService {

	
	@Autowired
	CommentRepositry commentRepositry;
	
	public List<Comment> getallcomment()
	{
		List<Comment> comment = new ArrayList<Comment>();
		commentRepositry.findAll().forEach(comment1->comment.add(comment1));
		return comment;
	}

	public Comment getCommentById(int id)
	{
	 return commentRepositry.findById(id).get();
	}
	public void saveOrUpdate(Comment comment)
	{
	commentRepositry.save(comment);
	}
	
	public void delete(int id) {
		commentRepositry.deleteById(id);
	}
	public void update(Comment comment,int commentid)
	{
		commentRepositry.save(comment);
	}
}
