package com.kodilla.exception.test;

public final class ExceptionHandling {

    /**Method handles the exception.*/
    public static void main(final String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2.5, 1.5);
        } catch (Exception e) {
            System.out.println("Invalid argument!");
        }
    }
}
