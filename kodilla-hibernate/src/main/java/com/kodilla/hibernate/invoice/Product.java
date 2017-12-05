package com.kodilla.hibernate.invoice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;

    public Product() {
    }

    public Product(final String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "PRODUCT_NAME")
    public String getName() {
        return name;
    }

    private void setId(final int id) {
        this.id = id;
    }

    private void setName(final String name) {
        this.name = name;
    }
}
