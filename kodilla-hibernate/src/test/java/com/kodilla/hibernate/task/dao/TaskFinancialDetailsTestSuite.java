package com.kodilla.hibernate.task.dao;

import java.math.BigDecimal;
import java.util.List;

import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskFinancialDetailsTestSuite {
    @Autowired
    TaskFinancialDetailsDao taskFinancialDetailsDao;

    @After
    public void afterEveryTest() {
        taskFinancialDetailsDao.deleteAll();
    }
    @Test
    public void testFindByPaid() {
        //Given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();
        //When
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //Then
        Assert.assertEquals(1, resultList.size());
    }

}
