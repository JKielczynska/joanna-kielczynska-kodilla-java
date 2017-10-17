package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "triangle";
    private double baseLength;
    private double height;

    public Triangle(double baseLength, double height) {
        this.baseLength = baseLength;
        this.height = height;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return (baseLength * height) / 2;
    }
}
