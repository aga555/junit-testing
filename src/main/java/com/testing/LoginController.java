package com.testing;

public class LoginController {
    private AuthenticationService service;

    public String service(String username, String password) {
        return service.authenticate(username, password) ? "/homee" : "/login";
    }
}
