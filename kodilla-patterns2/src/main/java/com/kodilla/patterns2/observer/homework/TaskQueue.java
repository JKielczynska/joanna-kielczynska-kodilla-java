package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TaskQueue implements Observable, Cloneable {
    private List<Observer> observers;
    private Queue<String> tasks;
    private String name;

    public TaskQueue(final String name) {
        observers = new ArrayList<>();
        tasks = new ArrayDeque<>();
        this.name = name;
    }

    public void submitTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers() {
        Queue<String> copiedTasks = new ArrayDeque<>(tasks);
        for (Observer observer : observers) {
            observer.update(name, copiedTasks);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
