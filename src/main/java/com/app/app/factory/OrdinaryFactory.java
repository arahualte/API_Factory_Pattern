package com.app.app.factory;

import com.app.app.model.User;

public class OrdinaryFactory implements UserFactory {

    private User ordinary;

    @Override
    public User createUser(String name) {
        if (this.ordinary == null) {
            this.ordinary = new User(name, "moderator", false);
        }
        return this.ordinary;
    }

}