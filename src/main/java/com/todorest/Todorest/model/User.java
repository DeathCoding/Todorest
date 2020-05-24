package com.todorest.Todorest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String username;
    private String email;
    private String password;

    public User(@JsonProperty("name") String username, @JsonProperty("email") String email, @JsonProperty("password") String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public User() { }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
