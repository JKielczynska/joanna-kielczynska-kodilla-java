package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class MovieStore {

    private Map<String, Set<String>> moviesTitlesWithTranslationsMap = new HashMap<>();

    public void addMoviesAndTranslations(final String id, final Set<String> movieTranslationsList) {
        moviesTitlesWithTranslationsMap.putIfAbsent(id, movieTranslationsList);
        moviesTitlesWithTranslationsMap.get(id).addAll(movieTranslationsList);
    }

    public Map<String, Set<String>> getMovies() {
        return moviesTitlesWithTranslationsMap;
    }
}