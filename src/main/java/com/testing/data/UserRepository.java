package com.testing.data;

import com.testing.User;

import java.util.HashMap;
import java.util.Map;

public class UserRepository {
    public User findByUserName(final String username) {
        return users.get(username);
    }
    private Map<String,User> users= new HashMap<String, User>();

    UserRepository() {
       users.put("matt", new User("matt","auto"));
       users.put("aga", new User("aga","dom"));
    }
}
