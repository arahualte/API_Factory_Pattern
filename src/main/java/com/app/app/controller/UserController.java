package com.app.app.controller;

import com.app.app.model.Ordinary;
import com.app.app.model.User;
import com.app.app.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public User create(@RequestBody Ordinary ordinaryUser) {
        return userService.create(ordinaryUser);
    }
}
