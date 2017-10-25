package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    /**Method calculates average of the inegers.*/
    static double getAverage(int[] numbers) {

        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .getAsDouble();
        System.out.println("Average: " + average);
        return average;
    }
}
