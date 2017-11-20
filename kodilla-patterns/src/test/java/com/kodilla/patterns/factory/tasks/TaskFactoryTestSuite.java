package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);
        boolean status = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean statusAfterExecution = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Shopping", shoppingTask.getTaskName());
        Assert.assertEquals(false, status);
        Assert.assertEquals(true, statusAfterExecution);
    }
    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);
        boolean status = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean statusAfterExecution = paintingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Painting", paintingTask.getTaskName());
        Assert.assertEquals(false, status);
        Assert.assertEquals(true, statusAfterExecution);
    }
    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING_TASK);
        boolean status = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean statusAfterExecution = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Driving", drivingTask.getTaskName());
        Assert.assertEquals(false, status);
        Assert.assertEquals(true, statusAfterExecution);
    }
}