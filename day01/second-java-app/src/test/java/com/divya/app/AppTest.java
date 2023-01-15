package com.divya.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testSayHi(){
        String expectedResult= "Hi from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.SayHi();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayHello(){
        String expectedResult= "Hello from greeting";
        Greeting greeting =new Greeting();
        String result1= greeting.SayHello();
        Assert.assertEquals(expectedResult,result1);
    }
    @Test
    public void testSayWelcome(){
        String expectedResult= "welcome from greeting";
        Greeting greeting =new Greeting();
        String result2= greeting.SayWelcome();
        Assert.assertEquals(expectedResult,result2);
    }

    @Test
    public void testSayBye() {
        String expectedResult = "bye from greeting";
        Greeting greeting = new Greeting();
        String result3 = greeting.SayBye();
        Assert.assertEquals(expectedResult, result3);

    }





}
