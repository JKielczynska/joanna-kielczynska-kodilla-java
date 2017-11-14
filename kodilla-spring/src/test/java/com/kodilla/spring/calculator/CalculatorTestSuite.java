package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAddition() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double sum = calculator.add(5.5,4.5);
        //Then
        Assert.assertTrue(sum == 10);
    }

    @Test
    public void testSubtraction() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double diff = calculator.sub(5.5,4.5);
        //Then
        Assert.assertTrue(diff == 1);
    }

    @Test
    public void testMultiplication() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double product = calculator.mul(5.5,4.5);
        //Then
        Assert.assertTrue(product == 24.75);
    }

    @Test
    public void testDivision() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        Double quotient = calculator.div(5.5,2);
        //Then
        Assert.assertTrue(quotient == 2.75);
    }
}
