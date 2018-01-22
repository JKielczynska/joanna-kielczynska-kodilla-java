package com.kodilla.patterns2.observer.homework;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Mentor firstMentor = new Mentor("John Kovalsky");
        Mentor secondMentor = new Mentor("Ann Novak");
        TaskQueue firstStudentQueue = new TaskQueue("First Student Task Queue");
        TaskQueue secondStudentQueue = new TaskQueue("Second Student Task Queue");
        TaskQueue thirdStudentQueue = new TaskQueue("Third Student Task Queue");
        firstStudentQueue.registerObserver(firstMentor);
        secondStudentQueue.registerObserver(secondMentor);
        thirdStudentQueue.registerObserver(secondMentor);
        //When
        firstStudentQueue.submitTask("#1 Task of the First Student");
        firstStudentQueue.submitTask("#2 Task of the First Student");
        secondStudentQueue.submitTask("#1 Task of the Second Student");
        thirdStudentQueue.submitTask("#1 Task of the Third Student");
        thirdStudentQueue.submitTask("#2 Task of the Third Student");
        thirdStudentQueue.submitTask("#3 Task of the Third Student");
        //Then
        assertEquals(2, firstMentor.getUpdateCount());
        assertEquals(4, secondMentor.getUpdateCount());
    }
}