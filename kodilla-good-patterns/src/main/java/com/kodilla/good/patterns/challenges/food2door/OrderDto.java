package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderDto {
    private List<Product> products;
    private boolean isOrdered;

    /**Data Transfer Object.*/
    public OrderDto(final List<Product> products, final boolean isOrdered) {
        this.products = products;
        this.isOrdered = isOrdered;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
