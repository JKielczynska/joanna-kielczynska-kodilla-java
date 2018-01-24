package com.kodilla.patterns2.observer.homework;

import java.util.Queue;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(final String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(String taskQueueName, Queue<String> tasksQueue) {
        System.out.printf("%s: New task in %s %n(total: %d tasks : %s )%n", mentorName, taskQueueName, tasksQueue.size(), tasksQueue);
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
