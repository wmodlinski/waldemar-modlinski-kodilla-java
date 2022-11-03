package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {

    void registerObserver(HomeworkObserver homeworkObserver);
    void notifyObservers();
    void removeObserver(HomeworkObserver homeworkObserver);
}