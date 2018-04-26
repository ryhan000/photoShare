package com.photoshare.service;

import java.util.List;

import com.photoshare.model.Photo;
import com.photoshare.model.User;

public interface PhotoService {
	
    Photo save(Photo photo);
	List<Photo> findByUser(User user);
	Photo findByPhotoId(Long photoId);
	List<Photo> findAll();

}
