package com.testing.web;

import com.testing.service.AuthenticationService;

public class LoginController {
    private AuthenticationService service;

    public String service (String username, String password) {
        return service.authenticate(username, password) ? "/home" : "/login";
    }

    LoginController(AuthenticationService service) {
        this.service = service;
    }
}
