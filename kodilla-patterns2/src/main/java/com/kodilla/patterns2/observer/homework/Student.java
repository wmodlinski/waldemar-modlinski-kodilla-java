package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements HomeworkObservable {

    private String name;
    private List<HomeworkObserver> mentors = new ArrayList<>();
    private List<String> homeworkStack = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void submitHomework(String homework){
        homeworkStack.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyObservers() {
        mentors.forEach(mentors -> mentors.update(this));
    }

    @Override
    public void removeObserver(HomeworkObserver observer) {
        mentors.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getHomeworkStack() {
        return homeworkStack;
    }
}