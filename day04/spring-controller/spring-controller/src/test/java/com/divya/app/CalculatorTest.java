package com.divya.app;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    public void testAdd(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 6.0;
        double result = calculator.add(a,b);
        Assert.assertEquals(expectedResult,result,0.00);

    }
    @Test
    public void testSub(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 0.0;
        double result = calculator.sub(a,b);
        Assert.assertEquals(expectedResult, result,0.00);

    }
    @Test
    public void tesMul(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 9.0;
        double result = calculator.mul(a,b);
        Assert.assertEquals(expectedResult, result,0.00);
    }

    @Test
    public void testDiv(){
        double a = 3.0;
        double b = 3.0;
        double expectedResult = 1.0;
        double result = calculator.div(a,b);
        Assert.assertEquals(expectedResult,result,0.00);
    }
}