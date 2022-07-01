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
        board.getToDoList().getTasks().add("1. Wykonać zadanie 14.3");
        board.getInProgressList().getTasks().add("2. Zrobić jeszcze tylko ten test!");
        board.getDoneList().getTasks().add("3. Finally done!");

        String testToDoList = board.getToDoList().getTasks().get(0);
        String testInProgressList = board.getInProgressList().getTasks().get(0);
        String testDoneList = board.getDoneList().getTasks().get(0);

        //Then
        System.out.println(testToDoList);
        System.out.println(testInProgressList);
        System.out.println(testDoneList);

        assertEquals("1. Wykonać zadanie 14.3", testToDoList);
        assertEquals("2. Zrobić jeszcze tylko ten test!", testInProgressList);
        assertEquals("3. Finally done!", testDoneList);
    }

    @Test
    void testConditional() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        //When
        boolean listTaskToDoExists = context.containsBean("listTaskToDo");
        boolean listTaskInProgressExists = context.containsBean("listTaskInProgress");
        boolean listTaskDoneExists = context.containsBean("listTaskDone");
        //Then
        System.out.println("Bean listTaskToDo was found in the container: " + listTaskToDoExists);
        System.out.println("Bean listTaskInProgress was found in the container: " + listTaskInProgressExists);
        System.out.println("Bean listTaskDone was found in the container: " + listTaskDoneExists);
    }
}