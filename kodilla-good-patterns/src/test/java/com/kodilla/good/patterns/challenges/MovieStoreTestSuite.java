package com.kodilla.good.patterns.challenges;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class MovieStoreTestSuite {
    @Test
    public void testMovieStore() {
        //Given
        MovieStore movieStore = buildMovieStore();
        //When
        String movieTitles = movieStore.getMovies().entrySet().stream()
                .flatMap(movie -> movie.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movieTitles);
        //Then
        Assert.assertEquals("Żelazny Człowiek!Iron Man!Mściciele!Avengers!Błyskawica!Flash", movieTitles);

    }

    private MovieStore buildMovieStore() {
        MovieStore movieStore = new MovieStore();

        Set<String> ironManTranslations = new LinkedHashSet<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        Set<String> avengersTranslations = new LinkedHashSet<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        Set<String> flashTranslations = new LinkedHashSet<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        movieStore.addMoviesAndTranslations("IM", ironManTranslations);
        movieStore.addMoviesAndTranslations("AV", avengersTranslations);
        movieStore.addMoviesAndTranslations("FL", flashTranslations);

        return movieStore;
    }
}
