package com.kodilla.testing.shape;

/**Class represents circle and its surface area.*/
public class Circle implements Shape {
    private final String shapeName = "circle";
    private final double radius;

    public Circle(final double radius) {
        this.radius = radius;
    }

    /**Returns geometrical shape name.*/
    public String getShapeName() {
        return shapeName;
    }

    /**Returns circle surface area.*/
    public double getField() {
        return Math.PI * radius * radius;
    }
}
