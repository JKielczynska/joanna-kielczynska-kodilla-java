package com.kodilla.stream.array;

import java.util.OptionalDouble;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        //When
        //Then
        Assert.assertEquals(10.5, ArrayOperations.getAverage(testArray), 0);
    }
}
