package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderDto {
    private Supplier supplier;
    private List<Product> products;
    private boolean isOrdered;

    /**Data Transfer Object.*/
    public OrderDto(final Supplier supplier, final List<Product> products, final boolean isOrdered) {
        this.supplier = supplier;
        this.products = products;
        this.isOrdered = isOrdered;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getProducts() {
        return products;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
