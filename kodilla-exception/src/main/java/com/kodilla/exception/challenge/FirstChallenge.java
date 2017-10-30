package com.kodilla.exception.challenge;

public class FirstChallenge {

    /**Method throws an ArithmeticException when denominator equals 0.*/
    public double divide(final double a, final double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * @param args
     * This main can throw an ArithmeticException.
     */
    public static void main(final String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by ZERO! " + e);
        } finally {
            System.out.println("End!");
        }
    }
}