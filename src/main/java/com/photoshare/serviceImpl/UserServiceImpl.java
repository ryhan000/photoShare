package com.photoshare.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.photoshare.dao.UserDao;
import com.photoshare.model.User;
import com.photoshare.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;

	@Override
	public User save(User save) {
		// TODO Auto-generated method stub
		return userDao.save(save);
	}

	@Override
	public User findByUserName(String userName) {
		// TODO Auto-generated method stub
		return userDao.findByUserName(userName);
	}

}
