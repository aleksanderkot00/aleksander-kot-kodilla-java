package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {

    public Order retrieve() {

        Product glutenFreeBread = new Product("Gluten Free Bread - 600 g", 3.59);
        Product orangeJuice = new Product("Orange Juice - 1L", 7.99);
        Product healthyEggs = new Product("Healthy Eggs - ten pieces", 8.00);

        Map<Product, Integer> order = new HashMap<>();
        order.put(glutenFreeBread, 300);
        order.put(orangeJuice, 5);
        order.put(healthyEggs, 2);

        return new Order(order, "223141");
    }
}
