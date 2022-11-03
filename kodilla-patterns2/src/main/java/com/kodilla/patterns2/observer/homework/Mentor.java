package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {

    private int counter = 0;
    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println("Got notice about assigment");
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }
}