package com.DrLabs.DLA.entity;

import lombok.Getter;

public class UserCredentials {

    private String username;
    @Getter
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
// Getters and setters
}

