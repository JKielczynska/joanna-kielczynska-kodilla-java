package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String mentorName;
    private int updateCount;

    public Mentor(final String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(TaskQueue taskQueue) {
        System.out.printf("%s: New task in %s %n(total: %d tasks)%n", mentorName, taskQueue.getName(), taskQueue.getTasks().size());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
