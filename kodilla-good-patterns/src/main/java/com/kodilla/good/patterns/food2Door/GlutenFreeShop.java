package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("We are on vacation. We will be back soon.");
        return false;
    }
}
