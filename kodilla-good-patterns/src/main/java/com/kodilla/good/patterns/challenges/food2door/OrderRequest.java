package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.util.List;

public class OrderRequest {
    private User user;
    private List<Product> products;
    private LocalDate orderDate;

    /**Constructor returns products ordered from the supplier.*/
    public OrderRequest(final User user, final List<Product> products, final LocalDate orderDate) {
        this.user = user;
        this.products = products;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
