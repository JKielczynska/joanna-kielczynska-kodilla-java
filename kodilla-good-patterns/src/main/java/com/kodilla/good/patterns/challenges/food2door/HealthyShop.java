package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements Supplier {
    private static final String NAME = "Healthy Shop";

    public static String getName() {
        return NAME;
    }

    @Override
    public boolean process(final Product product) {
        return false;
    }

    @Override
    public String toString() {
        return NAME;
    }
}