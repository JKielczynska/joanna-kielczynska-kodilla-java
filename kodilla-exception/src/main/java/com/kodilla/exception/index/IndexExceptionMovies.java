package com.kodilla.exception.index;

import java.util.List;

public class IndexExceptionMovies {
    /**Method prints name of the movie by index.*/
    public static void main(final String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();

        if (collection.size() >= 2) {
            String movie = collection.get(0);
            System.out.println(movie);

            String anotherMovie = collection.get(2);
            System.out.println(anotherMovie);
        }
    }
}
