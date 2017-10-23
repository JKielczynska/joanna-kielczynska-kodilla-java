package com.kodilla.stream.iterate;

import java.util.stream.Stream;

/**Class generates even numbers with using stream.*/
public class NumbersGenerator {

    /**Method generates even numbers with using stream.*/
    public static void generateEven(final int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
