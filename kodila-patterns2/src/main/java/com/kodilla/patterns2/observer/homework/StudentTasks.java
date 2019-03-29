package com.kodilla.patterns2.observer.homework;

import java.util.*;

public class StudentTasks implements Observable {
    private String studentName;
    private Deque<String> tasks;
    private List<StudentObserver> observers;

    public StudentTasks(String studentName) {
        this.studentName = studentName;
        tasks = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.addLast(task);
        notifyObservers();
    }

    @Override
    public void addObserver(StudentObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (StudentObserver observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(StudentObserver observer) {
        observers.remove(observer);
    }

    public String getStudentName() {
        return studentName;
    }

    public Queue<String> getTasks() {
        return tasks;
    }
}
