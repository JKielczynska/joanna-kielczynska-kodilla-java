package com.kodilla.good.patterns.challenges.airways;

public class FlightNotExistException extends RuntimeException {
    public FlightNotExistException(final String message) {
        super(message);
    }
}
