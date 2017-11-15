package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class Application {
    /** Method starts product ordering process.*/
    public static void main(final String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        Map<String, Supplier> suppliersMap = new HashMap<>();
        SupplyProcessor supplyProcessor = new SupplyProcessor(suppliersMap);
        supplyProcessor.process(orderRequest);
    }
}