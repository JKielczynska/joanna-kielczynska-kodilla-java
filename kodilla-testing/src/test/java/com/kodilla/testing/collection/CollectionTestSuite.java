package com.kodilla.testing.collection;


import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
    public void testOddNumbersExterminationEvenList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>(Arrays.asList(2,4,6));
        //When
        ArrayList<Integer> evenNumbersResult = oddNumbersExterminator.exterminate(evenNumbers);
        System.out.println("Testing even list...");
        //Then
        Assert.assertEquals(3, evenNumbersResult.size());
    }
    @Test
    public void testOddNumbersExterminationOddList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> oddNumbers = new ArrayList<Integer>(Arrays.asList(1,3,5));
        //When
        ArrayList<Integer> oddNumbersResult = oddNumbersExterminator.exterminate(oddNumbers);
        System.out.println("Testing odd list...");
        //Then
        Assert.assertEquals(0, oddNumbersResult.size());
    }
    @Test
    public void testOddNumbersExterminationMixedList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> mixedNumbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        //When
        ArrayList<Integer> mixedNumbersResult = oddNumbersExterminator.exterminate(mixedNumbers);
        System.out.println("Testing mixed list...");
        //Then
        Assert.assertEquals(2, mixedNumbersResult.size());
    }
}