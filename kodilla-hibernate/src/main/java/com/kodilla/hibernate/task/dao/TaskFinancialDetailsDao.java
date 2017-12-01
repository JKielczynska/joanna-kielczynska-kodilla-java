package com.kodilla.hibernate.task.dao;

import javax.transaction.Transactional;

import java.util.List;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface TaskFinancialDetailsDao extends CrudRepository<TaskFinancialDetails, Integer> {
    List<TaskFinancialDetails> findByPaid(boolean paid);
}
