package com.kodilla.hibernate.tasklist.dao;

import javax.transaction.Transactional;

import java.util.List;

import com.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
