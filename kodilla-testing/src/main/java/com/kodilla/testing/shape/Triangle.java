package com.kodilla.testing.shape;

/**Class represents triangle and its surface area.*/
public class Triangle implements Shape {
    private final String shapeName = "triangle";
    private final double baseLength;
    private final double height;

    public Triangle(final double baseLength, final double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    /**Returns geometrical shape name.*/
    public String getShapeName() {
        return shapeName;
    }

    /**Returns triangle surface area.*/
    public double getField() {
        return (baseLength * height) / 2;
    }
}
