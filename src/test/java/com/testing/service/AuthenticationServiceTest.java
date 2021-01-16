package com.testing.service;

import com.testing.User;
import com.testing.data.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class AuthenticationServiceTest {
    private AuthenticationService service;
    private UserRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = Mockito.mock(UserRepository.class);
        this.service = new AuthenticationService(this.repository);
    }

    @Test
    public void testAuthenticateMethod() {
        Mockito.when(this.repository.findByUserName(Mockito.anyString())).thenThrow(new IllegalArgumentException());

        this.service.authenticate("harry", "dirty");
    }

    @Test
    public void testAuthenticateMethodValidUser() {
        Mockito.when(this.repository.findByUserName(Mockito.anyString())).thenReturn(new User("cat", "hat"));

        Boolean expected = this.service.authenticate("cat", "hat");

        Assert.assertEquals(true, expected);
    }
    @Test
    public void testAuthenticateMethodNotValidUser() {
        Mockito.when(this.repository.findByUserName(Mockito.anyString())).thenReturn(new User("cat", "hat"));

        Boolean expected = this.service.authenticate("bat", "fat");

        Assert.assertEquals(false, expected);
    }
    @Test
    public void testAuthenticateMethodNotValidUserNotValidPass() {
        Mockito.when(this.repository.findByUserName(Mockito.anyString())).thenReturn(new User("cat", "hat"));

        Boolean expected = this.service.authenticate("cat", "fat");

        Assert.assertEquals(false, expected);
    }
    @Test
    public void testAuthenticateMethodNotValidUserNotValidUserName() {
        Mockito.when(this.repository.findByUserName(Mockito.anyString())).thenReturn(new User("cat", "hat"));

        Boolean expected = this.service.authenticate("cat", "clock");

        Assert.assertEquals(false, expected);
    }
}
