package com.phonebook.models;

public class User {

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    private String email;
    private String password;
}