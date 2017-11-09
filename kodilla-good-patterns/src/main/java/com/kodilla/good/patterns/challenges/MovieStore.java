package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MovieStore {

    private Map<String, List<String>> moviesTitlesWithTranslationsMap = new HashMap<>();

    public void addMovies(final String id, final List<String> movieTranslationsList) {
        moviesTitlesWithTranslationsMap.put(id, movieTranslationsList);
    }

    public Map<String, List<String>> getMovies() {
        return moviesTitlesWithTranslationsMap;
    }
}