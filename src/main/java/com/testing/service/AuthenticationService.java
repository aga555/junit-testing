package com.testing.service;

import com.testing.User;
import com.testing.data.UserRepository;

public class AuthenticationService {
    private UserRepository repository;

    public boolean authenticate(String username, String password) {
        User user =  repository.findByUserName(username);
        return user.getPassword().equals(password);
    }
}
