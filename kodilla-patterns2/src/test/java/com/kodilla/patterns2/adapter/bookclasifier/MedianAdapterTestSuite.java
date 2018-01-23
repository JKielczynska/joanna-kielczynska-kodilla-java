package com.kodilla.patterns2.adapter.bookclasifier;

import static org.junit.Assert.assertEquals;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<BookA> bookSet = new HashSet<>();
        bookSet.add(new BookA("Author 1", "Title 1", 1999, "1"));
        bookSet.add(new BookA("Author 2", "Title 2", 2000, "2"));
        bookSet.add(new BookA("Author 3", "Title 3", 2001, "3"));
        bookSet.add(new BookA("Author 4", "Title 4", 2002, "4"));
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2001, median);
    }
}