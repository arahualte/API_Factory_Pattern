package com.app.app.service;

import com.app.app.factory.UserFactory;
import com.app.app.model.Ordinary;
import com.app.app.model.User;
import com.app.app.utils.SetFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    MongoTemplate mongoTemplate;

    private UserFactory userFactory;

    public User create(Ordinary user) {
        this.userFactory = SetFactory.setFactory(user.getType());
        User userToSave = this.userFactory.createUser(user.getName());
        return mongoTemplate.save(userToSave);
    }
}
