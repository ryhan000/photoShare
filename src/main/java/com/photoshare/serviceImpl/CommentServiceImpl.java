package com.photoshare.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoshare.dao.CommentDao;
import com.photoshare.model.Comment;
import com.photoshare.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{
	
	@Autowired
	private CommentDao commentDao;
	

	@Override
	public Comment save(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.save(comment);
	}

	@Override
	public Comment findOne(Long commentId) {
		// TODO Auto-generated method stub
		return commentDao.findOne(commentId);
		
	}

	@Override
	public List<Comment> findByPhotoId(Long photoId) {
		// TODO Auto-generated method stub
		return commentDao.findByPhotoId(photoId);
	}

}