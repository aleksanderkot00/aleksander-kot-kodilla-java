package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class Order {

    private String type;
    private String orderNumber;
    private double price;
    private LocalDateTime submitDate;
    private LocalDateTime executionDate;

    public Order(String type, String orderNumber, double price, LocalDateTime submitDate, LocalDateTime executionDate) {
        this.type = type;
        this.orderNumber = orderNumber;
        this.price = price;
        this.submitDate = submitDate;
        this.executionDate = executionDate;
    }
}
