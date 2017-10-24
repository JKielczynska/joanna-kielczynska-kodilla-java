package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

/**Class creates list with random names of people.*/
public final class People {
    /**Class returns list with random names of people.*/
    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");
        return new ArrayList<String>(theList);
    }
}