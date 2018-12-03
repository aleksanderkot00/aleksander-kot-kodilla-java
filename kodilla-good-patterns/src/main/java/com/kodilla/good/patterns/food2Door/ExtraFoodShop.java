package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class ExtraFoodShop implements Producer {

    private Map<Product, Integer> resources;

    public ExtraFoodShop(Map<Product, Integer> resources) {
        this.resources = resources;
    }

    private boolean orderVerifier(Map<Product, Integer> order) {
            for(Map.Entry<Product, Integer> entry: order.entrySet()) {
                if ( entry.getValue() < 0 || entry.getValue() > resources.get(entry.getKey()) ) {
                    return false;
                }
            }
        return true;
    }

    @Override
    public boolean process(Order order) {
        if (orderVerifier(order.getPiecesOfProducts())) {
            System.out.println("Extra Food Shop has ordered products! " +
                    "Total price of order is equal " + order.orderPrice() + "zl.");
            return true;
        }
        System.out.println("Extra Food Shop hasn't ordered products! We will sent you a sms when we get them.");
        return false;
    }
}
