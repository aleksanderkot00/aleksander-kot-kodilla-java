package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double add = calculator.add(8,5);
        double sub = calculator.sub(2,3);
        double mul = calculator.mul(4,12);
        double div = calculator.div(2,4);
        double div2 = calculator.div(2,0);
        //Then
        Assert.assertEquals(13.0, add, 0.0001);
        Assert.assertEquals(-1.0, sub, 0.0001);
        Assert.assertEquals(48.0, mul, 0.0001);
        Assert.assertEquals(0.5, div, 0.0001);
        Assert.assertTrue(Double.isInfinite(div2));
    }
}
