package com.kodilla.good.patterns.challanges;

public class OrderRequest {

    private User buyer;
    private User seller;
    private Order order;

    public OrderRequest(User buyer, User seller, Order order) {
        this.buyer = buyer;
        this.seller = seller;
        this.order = order;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public Order getOrder() {
        return order;
    }
}
