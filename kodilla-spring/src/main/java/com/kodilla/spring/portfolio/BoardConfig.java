package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        TaskList list = new TaskList();
        list.addTask("ToDoTask1");
        list.addTask("ToDoTask2");
        return list;
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        TaskList list = new TaskList();
        list.addTask("InProgressTask1");
        list.addTask("InProgressTask2");
        list.addTask("InProgressTask3");
        return list;
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        TaskList list = new TaskList();
        list.addTask("DoneTask1");
        return list;
    }
}
