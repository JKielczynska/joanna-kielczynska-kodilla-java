package com.kodilla.exception.test;

public final class RouteNotFoundException extends Exception {
    public RouteNotFoundException(final String message) {
        super(message);
    }
}
