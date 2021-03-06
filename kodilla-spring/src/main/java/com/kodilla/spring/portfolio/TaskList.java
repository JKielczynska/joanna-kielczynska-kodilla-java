package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(final String task) {
        tasks.add(task);
    }

    public void removeTask(final String task) {
        tasks.remove(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}
