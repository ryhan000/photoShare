package com.photoshare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Comment {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long commentId;

    private String coment;


    @ManyToOne
    @JsonIgnore
    private Photo photo;

    private Long photoId;
    private String userName;
    
    
	public Long getCommetId() {
		return commentId;
	}
	public void setCommetId(Long commetId) {
		this.commentId = commetId;
	}
	public String getComent() {
		return coment;
	}
	public void setComent(String coment) {
		this.coment = coment;
	}
	public Photo getPhoto() {
		return photo;
	}
	public void setPhoto(Photo photo) {
		this.photo = photo;
	}
	public Long getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Long photoId) {
		this.photoId = photoId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    
    
    
    
    
}
