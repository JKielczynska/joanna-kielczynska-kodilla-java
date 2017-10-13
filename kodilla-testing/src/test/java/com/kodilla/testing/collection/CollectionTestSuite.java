package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    @Before
    public void beforeTestCase() {
        System.out.println("Test Case: begin.");
    }
    @After
    public void afterTestCase() {
        System.out.println("Test Case: end.");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> list = new ArrayList<Integer>();
        //When
        ArrayList<Integer> result = oddNumbersExterminator.exterminate(list);
        System.out.println("Testing empty list...");
        //Then
        Assert.assertTrue(result.isEmpty());
    }
    @Test
    public void testOddNumbersExterminationNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(Arrays.asList(2,4,6));
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>(Arrays.asList(1,3,5));
        //When
        ArrayList<Integer> evenNumbersResult = oddNumbersExterminator.exterminate(evenNumbers);
        System.out.println("Testing even list...");
        ArrayList<Integer> oddNumbersResult = oddNumbersExterminator.exterminate(oddNumbers);
        System.out.println("Testing odd list...");
        //Then
        Assert.assertEquals(3, evenNumbersResult.size());
        Assert.assertEquals(0, oddNumbersResult.size());
    }
}