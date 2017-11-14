package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface OrderService {
    boolean createOrder(String supplierId, List<Product> products);
}
