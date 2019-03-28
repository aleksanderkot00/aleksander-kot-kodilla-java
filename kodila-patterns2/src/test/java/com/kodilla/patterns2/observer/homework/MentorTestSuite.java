package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class MentorTestSuite {

    @Test
    public void testUpdate() {

        //Given
        StudentTasks olekTasks = new OlekTasks();
        StudentTasks marekTasks = new MarekTasks();
        Mentor mentorMateusz = new Mentor("Mentor Mateusz");
        Mentor mentorStefan = new Mentor("Mentor Stefan");
        olekTasks.addObserver(mentorMateusz);
        olekTasks.addObserver(mentorStefan);
        marekTasks.addObserver(mentorStefan);

        //When
        olekTasks.addTask("task 1");
        marekTasks.addTask("task 2");
        olekTasks.addTask("task 3");
        olekTasks.addTask("task 4");
        marekTasks.addTask("task 5");

        //Then
        assertEquals(3, mentorMateusz.getUpdateCount());
        assertEquals(5, mentorStefan.getUpdateCount());
    }
}