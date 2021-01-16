package com.testing.web;

import com.testing.service.AuthenticationService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;


public class LoginControllerTest {

    private LoginController controller;

    private AuthenticationService service;

    @Before
    public void setUp() throws Exception {
        this.service = Mockito.mock(AuthenticationService.class);
        this.controller = new LoginController(this.service);
    }

    @Test
    public void shouldReturnWhenValidUserLogs() {
        when(this.service.authenticate(anyString(), anyString())).thenReturn(true);

        String viewPath = controller.service("tom", "cat");

        Assert.assertNotNull(viewPath);
        Assert.assertEquals("/home", viewPath);
    }
}
