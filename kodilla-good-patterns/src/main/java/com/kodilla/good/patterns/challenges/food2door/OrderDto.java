package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderDto {
    private String supplierId;
    private List<Product> products;
    private boolean isOrdered;

    /**Data Transfer Object.*/
    public OrderDto(final String supplierId, final List<Product> products, final boolean isOrdered) {
        this.supplierId = supplierId;
        this.products = products;
        this.isOrdered = isOrdered;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
