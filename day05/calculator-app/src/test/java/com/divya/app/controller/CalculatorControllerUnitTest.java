package com.divya.app.controller;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.apache.coyote.http11.Constants.A;

public class CalculatorControllerUnitTest {
    CalculatorController calculatorController = new CalculatorController();


    @Test
    public void addTest(){
        long result = calculatorController.add(10,20);
        Assertions.assertEquals(result,30);

    }

    @Test
    public void subTest(){
        long result = calculatorController.sub(30,20);
        Assertions.assertEquals(result,10);
    }

    @Test
    public void mulTest(){
        long result = calculatorController.mul(10,20);
        Assertions.assertEquals(result,200);
    }

    @Test
    public void divTest(){
        long result = calculatorController.div(30,5);
        Assertions.assertEquals(result,6);
    }
}
