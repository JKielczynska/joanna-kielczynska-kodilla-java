package com.kodilla.good.patterns.challenges.service;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    /**Constructor uses interfaces: InformationServices, OrderService and OrderRepository.*/
    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    /**Method processes order.*/
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.createOrder(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getQuantity());

        if (isOrdered) {
            informationService.sendMessage(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(), false);
        }

    }
}
