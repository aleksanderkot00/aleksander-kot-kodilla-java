package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Order accepted! The products will be shipped soon.");
        return true;
    }
}
