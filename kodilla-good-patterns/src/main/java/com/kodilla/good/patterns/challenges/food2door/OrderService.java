package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public interface OrderService {
    boolean createOrder(Supplier supplier, List<Product> products);
}
