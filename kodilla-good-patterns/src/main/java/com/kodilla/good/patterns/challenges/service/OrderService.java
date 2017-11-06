package com.kodilla.good.patterns.challenges.service;

public interface OrderService {
    boolean createOrder(User user, Product product, int quantity);
}
