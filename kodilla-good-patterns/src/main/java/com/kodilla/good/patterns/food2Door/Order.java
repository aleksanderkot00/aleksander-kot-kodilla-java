package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class Order {

    private Map<Product, Integer> piecesOfProducts;
    private String orderNumber;

    public Order(Map<Product, Integer> piecesOfProducts, String orderNumber) {
        this.piecesOfProducts = piecesOfProducts;
        this.orderNumber = orderNumber;
    }

    public double orderPrice() {
        double price = 0;
        for (Map.Entry<Product, Integer> entry: piecesOfProducts.entrySet()) {
            price = price + entry.getKey().getPrice() * entry.getValue();
        }
        return price;
    }

    public Map<Product, Integer> getPiecesOfProducts() {
        return piecesOfProducts;
    }
}
