package com.app.app.factory;

import com.app.app.model.User;

public class AdminFactory implements UserFactory {

    private User admin;

    @Override
    public User createUser(String name) {
        if (this.admin == null) {
            this.admin = new User(name, "admin", true);
        }
        return this.admin;
    }
}