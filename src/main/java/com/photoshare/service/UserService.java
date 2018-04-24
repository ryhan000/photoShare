package com.photoshare.service;

import com.photoshare.model.User;

public interface UserService {
	
	    User save(User save);
	    User findByUserName(String userName);

}
