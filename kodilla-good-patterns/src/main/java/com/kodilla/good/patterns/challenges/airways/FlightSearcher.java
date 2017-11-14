package com.kodilla.good.patterns.challenges.airways;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.CosNaming.NamingContextPackage.NotFound;

public class FlightSearcher {
    private List<Flight> flightList = new ArrayList<>();

    public void addFlight(final Flight flight) {
        flightList.add(flight);
    }

    /**Method returns the list of flights from the airport.*/
    public List<Flight> findFlightsFrom(final Airport flightFrom) {
        List<Flight> departures = flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(flightFrom))
                .collect(Collectors.toList());
        return departures;
    }

    /**Method returns the list of flights to the airport.*/
    public List<Flight> findFlightsTo(final Airport flightTo) {
        List<Flight> arrivals = flightList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(flightTo))
                .collect(Collectors.toList());
        return arrivals;
    }

    /**Method returns the list of connecting flights.*/
    public List<Flight> findConnectingFlights(final Airport flightFrom, final Airport flightBy, final Airport flightTo) {
        List<Flight> transferFlight = new ArrayList<>();
        transferFlight.add(flight(flightFrom, flightBy));
        transferFlight.add(flight(flightBy, flightTo));

        return transferFlight;
    }

    private Flight flight(final Airport flightFrom, final Airport flightTo) {
        Flight flight = flightList.stream()
                .filter(f -> f.getDepartureAirport().equals(flightFrom))
                .filter(f -> f.getArrivalAirport().equals(flightTo))
                .findAny()
                .orElseThrow(() -> new FlightNotExistException("Flight doesn't exist."));

        return flight;
    }
}
