package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashMap;
import java.util.Map;

public class SupplyProcessor {
    private Map<String, Supplier> suppliersMap;

    /**Method stores the map with the suppliers.*/
    public SupplyProcessor() {
        this.suppliersMap = new HashMap<>();

        suppliersMap.put("EFS", new ExtraFoodShop());
        suppliersMap.put("GFS", new GlutenFreeShop());
        suppliersMap.put("HS", new HealthyShop());
    }

    /**Method processes the order.*/
    public OrderDto process(final OrderRequest orderRequest) {
        for (Product product : orderRequest.getProducts()) {
            suppliersMap.get(product.getSupplierId()).process(product);
            System.out.println(product + " from " + product.getSupplierId());
        }
        System.out.println("Shipment for " + orderRequest.getUser() + "\nDate of order: " + orderRequest.getOrderDate());
        return new OrderDto(orderRequest.getProducts(), true);
    }
}
