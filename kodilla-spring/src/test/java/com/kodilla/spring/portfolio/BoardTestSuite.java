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
    public void testToDoTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Wash the dishes.");
        //When
        String toDoTask = board.getToDoList().getTasks().get(0);
        //Then
        Assert.assertEquals("Wash the dishes.", toDoTask);
        System.out.println("To do: " + toDoTask);
    }
    @Test
    public void testInProgressTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getInProgressList().addTask("Clean the bathroom.");
        //When
        String inProgressTask = board.getInProgressList().getTasks().get(0);
        //Then
        Assert.assertEquals("Clean the bathroom.", inProgressTask);
        System.out.println("In progress: " + inProgressTask);
    }
    @Test
    public void testDoneTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getDoneList().addTask("Go shopping.");
        //When
        String doneTask = board.getDoneList().getTasks().get(0);
        //Then
        Assert.assertEquals("Go shopping.", doneTask);
        System.out.println("Done: " + doneTask);
    }
}
