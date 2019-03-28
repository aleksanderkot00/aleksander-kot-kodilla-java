package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void addObserver(StudentObserver observer);
    void notifyObservers();
    void removeObserver(StudentObserver observer);
}
