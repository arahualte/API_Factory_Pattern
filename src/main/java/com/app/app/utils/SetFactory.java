package com.app.app.utils;

import com.app.app.factory.AdminFactory;
import com.app.app.factory.UserFactory;
import com.app.app.factory.OrdinaryFactory;

public class SetFactory {
    public static UserFactory setFactory(String type) {
        switch (type) {
            case "admin":
                return new AdminFactory();

            case "ordinary":
                return new OrdinaryFactory();

            default:
                return null;
        }
    }
}
