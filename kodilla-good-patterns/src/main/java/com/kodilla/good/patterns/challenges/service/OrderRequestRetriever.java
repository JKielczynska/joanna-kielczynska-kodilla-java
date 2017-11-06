package com.kodilla.good.patterns.challenges.service;

public class OrderRequestRetriever {
    /**Method stores data about the order.*/
    public OrderRequest retrive() {
        User user = new User("jkowalski", "Jan", "Kowalski", "Warszawa");
        Product product = new Product("Snowboard", 699.99);

        return new OrderRequest(user, product, 2);
    }
}
