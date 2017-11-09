package com.kodilla.good.patterns.challenges.service;

public class ProductShoes extends Product {

    private String color;
    private String size;

    /**Constructor returns the type of product which is the Shoes with the color and size arguments.*/
    public ProductShoes(final String typeOfProduct, final String name, final double price, final String color, final String size) {
        super(typeOfProduct, name, price);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "typeOfProduct= " + getTypeOfProduct() +
                ", name= " + getName() +
                ", price= " + getPrice() +
                ", color= " + getColor() +
                ", size= " + getSize();
    }
}
