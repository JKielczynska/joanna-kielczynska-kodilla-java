package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;
    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }
    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddSquare() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        //When
        shape.addFigure(new Square(4));
        //Then
        Assert.assertEquals(1, shape.collectionSize());
    }
    @Test
    public void testAddTriangle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        //When
        shape.addFigure(new Triangle(4,4));
        //Then
        Assert.assertEquals(1, shape.collectionSize());
    }
    @Test
    public void testAddCircle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        //When
        shape.addFigure(new Circle(4));
        //Then
        Assert.assertEquals(1, shape.collectionSize());
    }
    @Test
    public void testRemoveSquare() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square testFigure = new Square(4);
        shape.addFigure(testFigure);
        //When
        boolean result = shape.removeFigure(testFigure);
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testRemoveTriangle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle testFigure = new Triangle(4, 4);
        shape.addFigure(testFigure);
        //When
        boolean result = shape.removeFigure(testFigure);
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testRemoveCircle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle testFigure = new Circle(4);
        shape.addFigure(testFigure);
        //When
        boolean result = shape.removeFigure(testFigure);
        //Then
        Assert.assertTrue(result);
    }
    @Test
    public void testGetSquare() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square testFigure = new Square(4);
        shape.addFigure(testFigure);
        //When
        shape.getFigure(0);
        //Then
        Assert.assertEquals(testFigure, shape.getFigure(0));
    }
    @Test
    public void testGetTriangle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle testFigure = new Triangle(4, 4);
        shape.addFigure(testFigure);
        //When
        shape.getFigure(0);
        //Then
        Assert.assertEquals(testFigure, shape.getFigure(0));
    }
    @Test
    public void testGetCircle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle testFigure = new Circle(4);
        shape.addFigure(testFigure);
        //When
        shape.getFigure(0);
        //Then
        Assert.assertEquals(testFigure, shape.getFigure(0));
    }
    @Test
    public void testShowSquare() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Square testFigure = new Square(4);
        shape.addFigure(testFigure);
        //When
        String addedFigure = shape.showFigures();
        //Then
        Assert.assertEquals(testFigure.toString(), addedFigure);
    }
    @Test
    public void testShowTriangle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Triangle testFigure = new Triangle(4,4);
        shape.addFigure(testFigure);
        //When
        String addedFigure = shape.showFigures();
        //Then
        Assert.assertEquals(testFigure.toString(), addedFigure);
    }
    @Test
    public void testShowCircle() {
        //Given
        ShapeCollector shape = new ShapeCollector();
        Circle testFigure = new Circle(4);
        shape.addFigure(testFigure);
        //When
        String addedFigure = shape.showFigures();
        //Then
        Assert.assertEquals(testFigure.toString(), addedFigure);
    }
}