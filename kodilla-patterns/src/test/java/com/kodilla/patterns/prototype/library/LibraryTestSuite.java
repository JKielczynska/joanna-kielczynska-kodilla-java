package com.kodilla.patterns.prototype.library;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

public class LibraryTestSuite {
    @Test
    public void testShallowCopy() {
        //Given
        Library library = new Library("Basic Library");
        library.addBook(new Book("Imperium", "Harris Robert", LocalDate.of(2006, 9, 4)));
        library.addBook(new Book("Lustrum", "Harris Robert", LocalDate.of(2009, 10, 8)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shalowCopy();
            clonedLibrary.setName("Shallow Copy of the Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);
        //When
        library.addBook(new Book("Dictator", "Harris Robert", LocalDate.of(2015, 10, 8)));
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
    }
    @Test
    public void testDeepCopy() {
        //Given
        Library library = new Library("Basic Library");
        library.addBook(new Book("Imperium", "Harris Robert", LocalDate.of(2006, 9, 4)));
        library.addBook(new Book("Lustrum", "Harris Robert", LocalDate.of(2009, 10, 8)));

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Copy of the Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(deepClonedLibrary);
        //When
        library.addBook(new Book("Dictator", "Harris Robert", LocalDate.of(2015, 10, 8)));
        //Then
        System.out.println(library);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
    }
}
