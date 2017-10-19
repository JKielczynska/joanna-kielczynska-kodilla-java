package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

/**Removes odd numbers from the ArrayList. */
public class OddNumbersExterminator {

    /**Removes odd numbers from the ArrayList.*/
    public List<Integer> exterminate(final List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}