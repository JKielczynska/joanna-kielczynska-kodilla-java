package com.kodilla.good.patterns.challenges.service;

public class OrderRequestRetriever {
    /**Method stores data about the order.*/
    public OrderRequest retrive() {
        User user = new User("jkowalski", "Jan", "Kowalski", "Warszawa");
        ProductShoes shoes = new ProductShoes("Shoes", "Sneakers", 129.99, "black", "42");

        return new OrderRequest(user, shoes, 2);
    }
}
