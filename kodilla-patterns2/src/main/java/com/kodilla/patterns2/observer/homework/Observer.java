package com.kodilla.patterns2.observer.homework;

import java.util.Queue;

public interface Observer {
    void update(String taskQueueName, Queue<String> copiedTasks);
}
