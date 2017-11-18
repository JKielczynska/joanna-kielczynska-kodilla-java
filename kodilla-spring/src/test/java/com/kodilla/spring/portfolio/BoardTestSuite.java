package com.kodilla.spring.portfolio;

import org.assertj.core.api.Assertions;
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
        //When
        board.getToDoList().addTask("Wash the dishes.");
        //Then
        Assertions.assertThat(board.getToDoList().getTasks()).hasSize(1).contains("Wash the dishes.");
        System.out.println("To do: " + board.getToDoList().getTasks());
    }
    @Test
    public void testInProgressTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().addTask("Clean the bathroom.");
        //Then
        Assertions.assertThat(board.getInProgressList().getTasks()).hasSize(1).contains("Clean the bathroom.");
        System.out.println("In progress: " + board.getInProgressList().getTasks());
    }
    @Test
    public void testDoneTask() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getDoneList().addTask("Go shopping.");
        //Then
        Assertions.assertThat(board.getDoneList().getTasks()).hasSize(1).contains("Go shopping.");
        System.out.println("Done: " + board.getDoneList().getTasks());
    }
}
