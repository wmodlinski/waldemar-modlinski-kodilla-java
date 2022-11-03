package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomeworkTestSuite {

    @Test
    void testUpdate() {

        //given
        Student waldek = new Student("Waldek");
        Student robert = new Student("Robert");
        Student czesio = new Student("Czesław");

        Mentor michal = new Mentor("Michał");
        Mentor marcin = new Mentor("Marcin");

        //when
        waldek.registerObserver(michal);
        robert.registerObserver(marcin);
        czesio.registerObserver(marcin);

        waldek.submitHomework("Task");
        waldek.submitHomework("Task 2");
        czesio.submitHomework("Task 1.2");
        robert.submitHomework("Task 2.1");

        int michalNotificationCount = michal.getCounter();
        int marcinNotificationCount= marcin.getCounter();

        //then
        assertEquals(2,marcinNotificationCount);
        assertEquals(2,michalNotificationCount);
    }
}