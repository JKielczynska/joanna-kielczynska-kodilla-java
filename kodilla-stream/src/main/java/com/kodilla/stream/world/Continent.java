package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Continent {
    private final String nameOfContinent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String nameOfContinent) {
        this.nameOfContinent = nameOfContinent;
    }

    public void addCountry(final Country country) {
        countryList.add(country);
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getCountryList() {
        return Collections.unmodifiableList(this.countryList);
    }


}
