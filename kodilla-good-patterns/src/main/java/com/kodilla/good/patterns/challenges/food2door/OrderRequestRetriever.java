package com.kodilla.good.patterns.challenges.food2door;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    /**Method stores data about the order.*/
    public OrderRequest retrieve() {

        User user = new User("anowak", "Anna", "Nowak");

        List<Product> products = new ArrayList<>();
        products.add(new Product("EFS","Chia seed", 5.99, 57));
        products.add(new Product("GFS","Buckwheat", 12.53, 22));
        products.add(new Product("HS","Goji beeries", 39.99, 10));

        LocalDate orderDate = LocalDate.of(2017, 11, 13);
        
        return new OrderRequest(user, products, orderDate);
    }
}
