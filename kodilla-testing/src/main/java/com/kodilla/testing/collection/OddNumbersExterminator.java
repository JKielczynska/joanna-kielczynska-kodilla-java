package com.kodilla.testing.collection;

import java.util.ArrayList;

/**Removes odd numbers from the ArrayList. */
public class OddNumbersExterminator {

    /**Removes odd numbers from the ArrayList.*/
    public ArrayList<Integer> exterminate(final ArrayList<Integer> numbers) {
        ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
