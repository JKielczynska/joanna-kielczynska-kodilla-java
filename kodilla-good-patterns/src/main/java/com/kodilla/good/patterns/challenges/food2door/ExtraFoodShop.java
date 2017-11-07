package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class ExtraFoodShop implements Supplier {
    private static final String NAME = "Extra Food Shop";

    public static String getName() {
        return NAME;
    }

    @Override
    public void process(final List<Product> products) {

    }

    @Override
    public String toString() {
        return NAME;
    }
}
