package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderRequest {
    private Supplier supplier;
    private List<Product> products;

    /**Constructor returns products ordered from the supplier.*/
    public OrderRequest(final Supplier supplier, final List<Product> products) {
        this.supplier = supplier;
        this.products = products;

    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getProducts() {
        return products;
    }


}
