package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public final class FlightSearch {
    Map<String, Boolean> airports = new HashMap<>();

    {
        airports.put("Warsaw-Modlin", true);
        airports.put("London-Luton", false);
    }

    /**Method checks if the flight route is feasible.*/
    public void findFlight(final Flight flight) throws RouteNotFoundException {
        checkAirportName(flight);

        if (airports.get(flight.getDepartureAirport()) && airports.get(flight.getArrivalAirport())) {
            System.out.println("Route " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
        } else {
            System.out.prigitntln("Route " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " isn't available.");
        }
    }

    private void checkAirportName(final Flight flight) throws RouteNotFoundException {
        Boolean departureAirportAvailability = airports.get(flight.getDepartureAirport());
        Boolean arrivalAirportAvailability = airports.get(flight.getArrivalAirport());

        if (departureAirportAvailability == null) {
            throw new RouteNotFoundException("Wrong departure airport name!");
        }

        if (arrivalAirportAvailability == null) {
            throw new RouteNotFoundException("Wrong arrival airport name!");
        }
    }
}
