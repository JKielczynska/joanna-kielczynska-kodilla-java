package com.kodilla.hibernate.tasklist.dao;

import java.util.List;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Sample task name";
    private static final String DESCRIPTION = "Task description";

    @Test
    public void testTaskDaoSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        int id = taskList.getId();
        TaskList readTask = taskListDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());
        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();
        //When
        List<TaskList> readTasks = taskListDao.findByListName(listName);
        //Then
        Assert.assertEquals(1, readTasks.size());
        //CleanUp
        int id = readTasks.get(0).getId();
        taskListDao.delete(id);
    }
}
