package com.kodilla.good.patterns.challenges.food2door;

import java.util.Map;

public class SupplyProcessor {
    private Map<String, Supplier> supplier;
    private OrderService orderService;


    public SupplyProcessor(final Map<String, Supplier> supplier, final OrderService orderService) {
        this.supplier = supplier;
        this.orderService = orderService;
    }

    /**Method processes the order.*/
    public OrderDto process(final OrderRequest orderRequest, Product product) {
        boolean isOrdered = orderService.createOrder(product.getSupplierId(), orderRequest.getProducts());

        if (isOrdered) {
            System.out.println("The order has been completed.");
            return new OrderDto(product.getSupplierId(), orderRequest.getProducts(), true);
        } else {
            System.out.println("The order hasn't been completed.");
            return new OrderDto(product.getSupplierId(), orderRequest.getProducts(),false);
        }

    }
}
