package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Facade {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public List<Company> retrieveCompaniesByName(String partOfName) throws FinderException {
        LOGGER.info("Searching company for part of name:" + partOfName);
        List<Company> companies;
        try {
            companies = companyDao.retrieveCompaniesByPartOfName("%" + partOfName + "%");
        } catch (Exception e) {
            throw new FinderException(FinderException.ERR_COMPANY_NOT_FOUND);
        }
        return companies;
    }

    public List<Employee> retrieveEmployeesByName(String partOfName) throws FinderException {
        LOGGER.info("Searching employee for part of name:" + partOfName);
        List<Employee> employees;
        try {
            employees = employeeDao.retrieveEmployeesByPartOfName("%" + partOfName + "%");
        } catch (Exception e) {
            throw new FinderException(FinderException.ERR_COMPANY_NOT_FOUND);
        }
        return employees;
    }

}
