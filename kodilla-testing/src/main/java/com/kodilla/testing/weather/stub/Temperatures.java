package com.kodilla.testing.weather.stub;

import java.util.HashMap;

/**
 * Interface contains HashMap collection where first element of the map is an identifier of weather station
 * and second element of the map is a temperature in Celsius degrees.
 */
public interface Temperatures {
    HashMap<Integer, Double> getTemperatures();
}
