package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

/**Class calculates weather forecasts based on data from temperature sensors.*/
public class WeatherForecast {
    Temperatures temperatures;

    public WeatherForecast(final Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    /**Calculates weather forecast by adding 1 degree to the results of each temperature sensor.*/
    public Map<Integer, Double> calculateForecast() {
        Map<Integer, Double> resultMap = new HashMap<Integer, Double>();

        for (Map.Entry<Integer, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }
}
