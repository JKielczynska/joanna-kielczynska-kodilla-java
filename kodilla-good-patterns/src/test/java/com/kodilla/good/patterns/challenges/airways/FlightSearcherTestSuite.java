package com.kodilla.good.patterns.challenges.airways;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FlightSearcherTestSuite {
    @Test
    public void testAllFlightsFrom() {
        //Given
        FlightSearcher flightSearcher = flightDatabase();
        //When
        List <Flight> expectedFlights = flightSearcher.findFlightsFrom(new Airport("Warsaw"));
        System.out.println(expectedFlights);
        //Then
        Assert.assertEquals(expectedFlights.size(), 3);
    }
    @Test
    public void testAllFlightsTo() {
        //Given
        FlightSearcher flightSearcher = flightDatabase();
        //When
        List <Flight> expectedFlights = flightSearcher.findFlightsTo(new Airport("New York"));
        System.out.println(expectedFlights);
        //Then
        Assert.assertEquals(expectedFlights.size(), 3);
    }
    @Test
    public void testAllFlightsBy() {
        //Given
        FlightSearcher flightSearcher = flightDatabase();
        //When
        List<Flight> expectedFlights = flightSearcher.findConnectingFlights(new Airport("Warsaw"), new Airport("London"), new Airport("New York"));
        System.out.println(expectedFlights);
        //Then
        Assert.assertEquals(expectedFlights.toString(), "[Flight from  Warsaw to London, Flight from  London to New York]");
    }

    public FlightSearcher flightDatabase() {
        FlightSearcher flightSearcher = new FlightSearcher();
        Flight flight1 = new Flight(new Airport("Warsaw"), new Airport("London"));
        Flight flight2 = new Flight(new Airport("London"), new Airport("New York"));
        Flight flight3 = new Flight(new Airport("Warsaw"), new Airport("New York"));
        Flight flight4 = new Flight(new Airport("Warsaw"), new Airport("Madrid"));
        Flight flight5 = new Flight(new Airport("Madrid"), new Airport("New York"));

        flightSearcher.addFlight(flight1);
        flightSearcher.addFlight(flight2);
        flightSearcher.addFlight(flight3);
        flightSearcher.addFlight(flight4);
        flightSearcher.addFlight(flight5);

        return flightSearcher;
    }
}
