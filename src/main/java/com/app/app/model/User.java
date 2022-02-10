package com.app.app.model;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("users")
public class User {

    @Id
    private String id;

    public User(String name, String type, boolean hasPrivileges) {
        this.name = name;
        this.type = type;
        this.hasPrivileges = hasPrivileges;
    }

    private String name;
    private String type;
    private boolean hasPrivileges;
}