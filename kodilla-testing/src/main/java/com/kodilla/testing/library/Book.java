package com.kodilla.testing.library;

/**Class represents books available in library.*/
public class Book {
    private String title;
    private String author;
    private int publicationYear;

    /**Constructor with tritle, aurhor and publication year arguments.*/
    public Book(final String title, final String author, final int publicationYear) {

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", author='" + author + '\'' + ", publicationYear=" + publicationYear + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Book book = (Book) o;

        if (publicationYear != book.publicationYear) {
            return false;
        }
        if (!title.equals(book.title)) {
            return false;
        }
        return author.equals(book.author);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publicationYear;
        return result;
    }
}

