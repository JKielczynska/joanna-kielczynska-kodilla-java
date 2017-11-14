package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String supplierId;
    private String name;
    private double price;
    private int quantity;

    /**Constructor defines product with name, price and quantity arguments.*/
    public Product(final String supplierId, final String name, final double price, final int quantity) {
        this.supplierId = supplierId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return quantity + " items " + name + " (" + price + "PLN)";
    }
}
