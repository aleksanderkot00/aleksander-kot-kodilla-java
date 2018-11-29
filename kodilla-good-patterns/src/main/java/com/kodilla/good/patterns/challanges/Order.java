package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class Order {

    private String type;
    private String orderNumber;
    private double price;
    private LocalDateTime orderingDate;
    private LocalDateTime deliveryDate;

    public Order(String type, String orderNumber, double price, LocalDateTime orderingDate, LocalDateTime deliveryDate) {
        this.type = type;
        this.orderNumber = orderNumber;
        this.price = price;
        this.orderingDate = orderingDate;
        this.deliveryDate = deliveryDate;
    }
}
