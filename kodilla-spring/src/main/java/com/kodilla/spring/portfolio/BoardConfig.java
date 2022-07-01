package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("listTaskToDo")
    public TaskList listTaskToDo;

    @Autowired
    @Qualifier("listTaskInProgress")
    public TaskList listTaskInProgress;

    @Autowired
    @Qualifier("listTaskDone")
    public TaskList listTaskDone;


    @Bean("listTaskToDo")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean("listTaskInProgress")
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean("listTaskDone")
    public TaskList doneList() {
        return new TaskList();
    }

    @Bean
    public Board board() {
        return new Board(listTaskToDo, listTaskInProgress, listTaskDone);
    }
}