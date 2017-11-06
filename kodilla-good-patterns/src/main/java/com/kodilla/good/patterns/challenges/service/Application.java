package com.kodilla.good.patterns.challenges.service;

public class Application {
    /**Method starts product ordering process.*/
    public static void main(final String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrive();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new OrderServiceProduct() , new OrderRepositoryDatabse());
        productOrderService.process(orderRequest);

    }
}
