package com.kodilla.good.patterns.challenges.airways;

public class Flight {
    private final Airport departureAirport;
    private final Airport arrivalAirport;

    public Flight(final Airport departureAirport, final Airport arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Flight flight = (Flight) o;

        if (!departureAirport.equals(flight.departureAirport)) {
            return false;
        }
        return arrivalAirport.equals(flight.arrivalAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport.hashCode();
        result = 31 * result + arrivalAirport.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight from  " + departureAirport +
                " to " + arrivalAirport;
    }
}
