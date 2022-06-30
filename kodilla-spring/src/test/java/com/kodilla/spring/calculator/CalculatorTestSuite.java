package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double val = calculator.add(5, 5);

        //Then
        assertEquals(10.0, val, 0.01);
    }

    @Test
    public void testSub() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double val = calculator.sub(5.0, 5.0);

        //then
        assertEquals(0.0, val, 0.01);
    }

    @Test
    public void testMul() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double val = calculator.mul(5.0, 5.0);

        //then
        assertEquals(25.0, val, 0.01);
    }

    @Test
    public void testDiv() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double val = calculator.div(5.0, 5.0);

        //then
        assertEquals(1.0, val, 0.01);
    }
}