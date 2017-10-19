package com.kodilla.testing.library;

import java.util.List;

/**Interface contains list of books beginning title with title fragment, list of books borrowed by library user,
 * method checks availability of a book and method which returns all borrowed books by library user. */
public interface LibraryDatabase {
    // lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by libraryUser
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for libraryUser
    // returns true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned back
    int returnBooks(LibraryUser libraryUser);
}
