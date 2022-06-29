package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        calculator.add(5, 5);

        //Then
        //do nothing
    }

    @Test
    public void testSub() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.sub(5.0, 5.0);
        //then
        //do nothing
    }

    @Test
    public void testMul() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.mul(5.0, 5.0);

        //then
        //do nothing
    }

    @Test
    public void testDiv() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        calculator.div(5.0, 5.0);

        //then
        //doNothing
    }
}