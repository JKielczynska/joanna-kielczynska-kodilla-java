package com.kodilla.good.patterns.challenges.airways;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        Flight firstFlight = flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(flightFrom))
                .filter(flight -> flight.getArrivalAirport().equals(flightBy))
                .findAny().get();
        Flight secondFlight = flightList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(flightBy))
                .filter(flight -> flight.getArrivalAirport().equals(flightTo))
                .findAny().get();
        transferFlight.add(firstFlight);
        transferFlight.add(secondFlight);

        return transferFlight;
    }
}
