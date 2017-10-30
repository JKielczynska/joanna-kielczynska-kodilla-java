package com.kodilla.exception.test;

public final class SecondChallenge {
    /**Method throws and exception when arguments x<1 or x>= 2 or y==1.5.*/
    public String probablyIWillThrowException(final double x, final double y) throws Exception {
        if (x >= 2 || x < 1 || y == 1.5) {
            throw new Exception();
        }
        return "Done!";
    }
}