package com.photoshare.dao;

import org.springframework.data.repository.CrudRepository;

import com.photoshare.model.User;

public interface UserDao extends CrudRepository<User, Long> {

    User save(User save);
    User findByUserName(String userName);
}

