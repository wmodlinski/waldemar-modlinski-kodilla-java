package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
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
        board.getToDoList().getTasks().add("1. Wykonać zadanie 14.3");
        board.getInProgressList().getTasks().add("2. Zrobić jeszcze tylko ten test!");
        board.getDoneList().getTasks().add("3. Finally done!");

        String test1 = board.getToDoList().getTasks().get(0);
        String test2 = board.getInProgressList().getTasks().get(0);
        String test3 = board.getDoneList().getTasks().get(0);

        //Then
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);

        assertEquals("1. Wykonać zadanie 14.3", test1);
        assertEquals("2. Zrobić jeszcze tylko ten test!", test2);
        assertEquals("3. Finally done!", test3);
    }

    @Test
    void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When
        boolean list1Exists = context.containsBean("list1");
        boolean list2Exists = context.containsBean("list2");
        boolean list3Exists = context.containsBean("list3");
        //Then
        System.out.println("Bean list1 was found in the container: " + list1Exists);
        System.out.println("Bean list2 was found in the container: " + list2Exists);
        System.out.println("Bean list3 was found in the container: " + list3Exists);
    }
}