package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
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

        List<String> ironManTranslations = new ArrayList<>();
        ironManTranslations.add("Żelazny Człowiek");
        ironManTranslations.add("Iron Man");

        List<String> avengersTranslations = new ArrayList<>();
        avengersTranslations.add("Mściciele");
        avengersTranslations.add("Avengers");

        List<String> flashTranslations = new ArrayList<>();
        flashTranslations.add("Błyskawica");
        flashTranslations.add("Flash");

        movieStore.addMovies("IM", ironManTranslations);
        movieStore.addMovies("AV", avengersTranslations);
        movieStore.addMovies("FL", flashTranslations);

        return movieStore;
    }
}
