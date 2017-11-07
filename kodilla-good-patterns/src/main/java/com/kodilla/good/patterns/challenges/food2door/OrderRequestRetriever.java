package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    /**Method stores data about the order.*/
    public OrderRequest retrive() {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();

        List<Product> products = new ArrayList<>();
        products.add(new Product("Chia seed", 5.99, 57));
        products.add(new Product("Buckwheat", 12.53, 22));
        products.add(new Product("Goji beeries", 39.99, 10));

        return new OrderRequest(extraFoodShop, products);
    }
}
