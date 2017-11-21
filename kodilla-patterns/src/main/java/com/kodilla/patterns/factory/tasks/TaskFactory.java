package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPING_TASK = "Shopping";
    public static final String PAINTING_TASK = "Painting";
    public static final String DRIVING_TASK = "Driving";

    /**Method creates task in line with factory design pattern.*/
    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING_TASK:
                return new ShoppingTask(SHOPPING_TASK, "bread", 2);
            case PAINTING_TASK:
                return new PaintingTask(PAINTING_TASK, "grey", "walls in the bedroom");
            case DRIVING_TASK:
                return new DrivingTask(DRIVING_TASK, "Lublin", "car");
            default:
                throw new IllegalArgumentException("The task doesn't exist.");
        }
    }
}
