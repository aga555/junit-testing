package com.testing;

public class LoginController {
    private AuthenticationService service;

    public String service(String username, String password)
    {
        if (service.authenticate(username, password)) {
            return "/homee";
        } else {
            return "/login";
        }

    }

}
