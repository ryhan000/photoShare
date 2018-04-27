package com.photoshare.service;

import java.util.List;

import com.photoshare.model.Comment;

public interface CommentService {
	Comment save(Comment comment);

	Comment findOne(Long commentId);

	List<Comment> findByPhotoId(Long photo);
}
