package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class OrderServiceProduct implements OrderService {

    /**Method creates the order.*/
    public boolean createOrder(final String supplierId, final List<Product> products) {

        for (int n = 0; n < products.size(); n++) {
            System.out.println(products.get(n) + " ordered from " + supplierId);
        }
        return true;
    }
}
