package com.kodilla.good.patterns.challenges.service;

public class OrderDto {
    private User user;
    private Product product;
    private boolean isOrdered;

    /**Data Transfer Object.*/
    public OrderDto(final User user, final Product product, final boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
