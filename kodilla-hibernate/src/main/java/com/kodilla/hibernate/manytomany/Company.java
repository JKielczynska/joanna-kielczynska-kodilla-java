package com.kodilla.hibernate.manytomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@NamedNativeQuery(
        name = "Company.retrieveCompaniesByFirstThreeCharacters",
        query = "SELECT * FROM COMPANIES WHERE SUBSTRING(COMPANY_NAME, 1, 3) = :THREEFIRSTCHARACTERS",
        resultClass = Company.class
)
@NamedQuery(
        name = "Company.retrieveCompaniesByPartOfName",
        query = "FROM Company WHERE name LIKE :PARTOFNAME"
)
@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(final String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.PERSIST, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setName(final String name) {
        this.name = name;
    }

    private void setEmployees(final List<Employee> employees) {
        this.employees = employees;
    }
}

