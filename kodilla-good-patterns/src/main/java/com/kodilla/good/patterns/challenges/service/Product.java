package com.kodilla.good.patterns.challenges.service;

public class Product {
    private String typeOfProduct;
    private String name;
    private double price;

    /**Constructor returns type, name, and price of the product.*/
    public Product(final String typeOfProduct, final String name, final double price) {
        this.typeOfProduct = typeOfProduct;
        this.name = name;
        this.price = price;
    }

    public String getTypeOfProduct() {
        return typeOfProduct;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
