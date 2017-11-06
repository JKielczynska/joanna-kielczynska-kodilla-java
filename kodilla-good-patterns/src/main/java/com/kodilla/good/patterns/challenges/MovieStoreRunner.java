package com.kodilla.good.patterns.challenges;

import java.util.stream.Collectors;

public class MovieStoreRunner {

    /**Method prints movie titles using stream.*/
    public static void main(final String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieTitles);
    }
}
