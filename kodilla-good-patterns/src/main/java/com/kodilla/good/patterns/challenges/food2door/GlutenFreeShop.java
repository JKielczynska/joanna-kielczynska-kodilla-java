package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements Supplier {
    private static final String NAME = "Gluten Free Shop";

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