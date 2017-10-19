package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

/**Class supports lending of books from the library.*/
public class BookLibrary {
    LibraryDatabase libraryDatabase;

    /**Constructor supports database.*/
    public BookLibrary(final LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    /**Specifies additional conditions for search books.*/
    public List<Book> listBookWithCondition(final String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) {
            return bookList;
        }
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) {
            return bookList;
        }
        bookList = resultList;
        return bookList;
    }

    /**Returns list of books rented by the user.*/
    public List<Book> listBooksInHandsOf(final LibraryUser libraryUser) {
        List<Book> rentedBookList = libraryDatabase.listBooksInHandsOf(libraryUser);
        return rentedBookList;
    }
}
