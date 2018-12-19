package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("ToDoTask3");
        board.getInProgressList().addTask("InProgressTask4");
        board.getDoneList().addTask("DoneTask2");
        //Then
        Assert.assertEquals("ToDoTask3", board.getToDoList().getTasks().get(board.getToDoList().getTasks().size()-1));
        Assert.assertEquals("InProgressTask4", board.getInProgressList().getTasks().get(board.getInProgressList().getTasks().size()-1));
        Assert.assertEquals("DoneTask2", board.getDoneList().getTasks().get(board.getDoneList().getTasks().size()-1));
    }
}
