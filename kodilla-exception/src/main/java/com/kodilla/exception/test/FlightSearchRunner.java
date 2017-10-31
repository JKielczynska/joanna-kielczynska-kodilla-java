package com.kodilla.exception.test;

public class FlightSearchRunner {

    /**Method prints the exception when airport name is null.*/
    public static void main(final String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Warsaw-Modlin", "Berlin-Tegel");

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
