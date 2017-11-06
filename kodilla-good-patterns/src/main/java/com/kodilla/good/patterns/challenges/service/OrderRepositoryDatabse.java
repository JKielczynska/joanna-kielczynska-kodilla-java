package com.kodilla.good.patterns.challenges.service;

public class OrderRepositoryDatabse implements OrderRepository {
    public boolean createOrder(final User user, final Product product, final int quantity) {
        System.out.println(user + " ordered " + quantity + " items " + product);
        return true;
    }
}
