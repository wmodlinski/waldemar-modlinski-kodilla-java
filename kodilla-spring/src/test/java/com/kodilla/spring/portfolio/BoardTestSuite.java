package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(
                BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("1. Wykonać zadanie 14.3");
        board.inProgressList.tasks.add("2. Zrobić jeszcze tylko ten test!");
        board.doneList.tasks.add("3. Finally done!");

        String test1 = board.toDoList.getTasks().get(0);
        String test2 = board.inProgressList.getTasks().get(0);
        String test3 = board.doneList.getTasks().get(0);

        //Then
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

        assertEquals("1. Wykonać zadanie 14.3", test1);
        assertEquals("2. Zrobić jeszcze tylko ten test!", test2);
        assertEquals("3. Finally done!", test3);
    }
}