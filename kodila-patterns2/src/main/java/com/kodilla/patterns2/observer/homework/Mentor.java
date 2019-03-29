package com.kodilla.patterns2.observer.homework;

public class Mentor implements StudentObserver {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentTasks tasks) {
        updateCount++;
        System.out.println(name + ": New task from " + tasks.getStudentName() + "\n" +
                " (total: " + tasks.getTasks().size() + " tasks");
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
