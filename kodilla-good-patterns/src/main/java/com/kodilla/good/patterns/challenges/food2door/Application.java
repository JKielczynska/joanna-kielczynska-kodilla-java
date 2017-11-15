package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    /** Method starts product ordering process.*/
    public static void main(final String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        SupplyProcessor supplyProcessor = new SupplyProcessor();
        supplyProcessor.process(orderRequest);
    }
}