package com.kodilla.testing.shape;

/**Class represents square and its surface area.*/
public class Square implements Shape {
    private final String shapeName = "square";
    private final double sideLength;

    public Square(final double sideLength) {
        this.sideLength = sideLength;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return sideLength * sideLength;
    }
}
