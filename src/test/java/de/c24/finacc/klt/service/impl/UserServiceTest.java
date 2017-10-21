package de.c24.finacc.klt.service.impl;

import de.c24.finacc.klt.service.UserService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class UserServiceTest {

    private UserService userService;


    public UserServiceTest() {
        this.userService = new UserServiceImpl();
    }


    @Test
    public void shouldSendStatusAsfunny() {
        String expected = "funny";
        String status = userService.validate(29);
        assertEquals(status, expected);
    }


    @Test
    public void shouldSendStatusAsOk() {
        String expected = "OK";
        String status = userService.validate(44);
        assertEquals(status, expected);
    }


    @Test
    public void shouldSendStatusAsOld() {
        String expected = "too old";
        String status = userService.validate(100);
        assertEquals(status, expected);
    }


    @Test
    public void shouldSendStatusAsYoung() {
        String expected = "too young";
        String status = userService.validate(1);
        assertEquals(status, expected);
    }

}