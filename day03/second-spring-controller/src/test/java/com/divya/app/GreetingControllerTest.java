package com.divya.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GreetingControllerTest {

    GreetingController greetingController = new GreetingController();

    @Test
    public void testSayGreet() {
        String expectedResult = "greet from App";
        String result = GreetingController.SayGreet();
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testSayWelcome() {
        String expectedResult = "welcome from App";
        String result = GreetingController.SayWelcome();
        Assert.assertEquals(expectedResult, result);

    }
    @Test
    public void testSayHi() {
        String expectedResult = "hi from App";
        String result = GreetingController.SayHi();
        Assert.assertEquals(expectedResult, result);
    }
    @Test
    public void testSayThanks() {
        String expectedResult = "thanks from App";
        String result = GreetingController.SayThanks();
        Assert.assertEquals(expectedResult, result);
    }
}
