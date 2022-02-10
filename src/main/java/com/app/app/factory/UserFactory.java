package com.app.app.factory;

import com.app.app.model.User;

public interface UserFactory {
    public User createUser(String name);
}