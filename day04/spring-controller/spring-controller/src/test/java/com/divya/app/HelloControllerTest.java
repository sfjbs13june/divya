package com.divya.app;

import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class HelloControllerTest {

    HelloController helloController=new HelloController();
    @Test
    public void testSayHello()
    {
        String expectedResult="Hello from App";
        String result=helloController.SayHello();
        Assert.assertEquals(expectedResult,result);
    }

@Test
public void testrequestHello()
{
    String expectedResult="Hello from Request mapping";
    String result=helloController.requestHello();
    Assert.assertEquals(expectedResult,result);
}
@Test
    public void testrequestWelcome()
{
    String name="world";
    String expectedResult="welcome to"+name;
    String result= helloController.welcome(name);
    Assert.assertEquals(expectedResult,result);
}

    @Test
    public void testrequestSendMessage()
    {
        String message="hi";
        String expectedResult="send message"+message;
        String result= helloController.SendMessage(message);
        Assert.assertEquals(expectedResult,result);
    }



}
