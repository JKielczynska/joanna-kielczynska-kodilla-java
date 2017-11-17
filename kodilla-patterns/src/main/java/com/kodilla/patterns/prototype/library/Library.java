package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void addBook(final Book book) {
        books.add(book);
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book book : books) {
            s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shalowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    /**Method allows deep cloning.*/
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for (Book theBook : books) {
            clonedLibrary.getBooks().add(theBook);
        }
        return clonedLibrary;
    }
}