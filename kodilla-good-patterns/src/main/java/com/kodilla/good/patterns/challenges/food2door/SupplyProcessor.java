package com.kodilla.good.patterns.challenges.food2door;

public class SupplyProcessor {
    private Supplier supplier;
    private OrderService orderService;

    public SupplyProcessor(final Supplier supplier, final OrderService orderService) {
        this.supplier = supplier;
        this.orderService = orderService;
    }

    /**Method processes the order.*/
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getSupplier(), orderRequest.getProducts());

        if (isOrdered) {
            System.out.println("The order has been completed.");
            return new OrderDto(orderRequest.getSupplier(), orderRequest.getProducts(), true);
        } else {
            System.out.println("The order hasn't been completed.");
            return new OrderDto(orderRequest.getSupplier(), orderRequest.getProducts(), false);
        }

    }
}
