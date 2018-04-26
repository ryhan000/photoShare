package com.photoshare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.photoshare.service.UserService;

@RestController
@RequestMapping("/rest")
public class UserResources {
    @Autowired
    private UserService userService;

    @RequestMapping("user/users")
    public String loginSucess() {
        return "Login Sucessful!";
    }
}