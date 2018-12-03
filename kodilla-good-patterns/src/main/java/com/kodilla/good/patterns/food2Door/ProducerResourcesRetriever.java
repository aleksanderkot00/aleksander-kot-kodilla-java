package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;
import java.util.Map;

public class ProducerResourcesRetriever {

    public Map<Product, Integer> retrieve() {
        Product glutenFreeBread = new Product("Gluten Free Bread - 600 g", 3.59);
        Product orangeJuice = new Product("Orange Juice - 1L", 7.99);
        Product healthyEggs = new Product("Healthy Eggs - ten pieces", 8.00);

        Map<Product, Integer> resources = new HashMap<>();
        resources.put(glutenFreeBread, 127);
        resources.put(orangeJuice, 253);
        resources.put(healthyEggs, 97);

        return resources ;
    }
}
