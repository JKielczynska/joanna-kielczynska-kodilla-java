package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    @Autowired
    private Facade facade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Before
    public void beforeEveryTest() {
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        companyDao.save(softwareMachine);
        companyDao.save(dataMaesters);
        companyDao.save(greyMatter);

        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);
    }
    @After
    public void afterEveryTest() {
        companyDao.deleteAll();
        employeeDao.deleteAll();
    }
    @Test
    public void testFindCompaniesByPartOfName() throws Exception {
        //Given
        //When
        List<Company> resultList = facade.retrieveCompaniesByName("ware");
        //Then
        Assert.assertEquals(1, resultList.size());
    }
    @Test
    public void testFindEmployeesByPartOfLastname() throws Exception {
        //Given
        //When
        List<Employee> resultList = facade.retrieveEmployeesByName("smi");
        //Then
        Assert.assertEquals(1,resultList.size());
    }
    @Test
    public void testFindEmployeesByPartOfFirstname() throws Exception {
        //Given
        //When
        List<Employee> resultList = facade.retrieveEmployeesByName("ohn");
        //Then
        Assert.assertEquals(1,resultList.size());
    }
}
