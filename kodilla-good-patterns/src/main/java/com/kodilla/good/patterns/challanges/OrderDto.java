package com.kodilla.good.patterns.challanges;

public class OrderDto {

    private User buyer;
    private User seller;
    private boolean isOrderDone;

    public OrderDto(User buyer, User seller, boolean isOrderDone) {
        this.buyer = buyer;
        this.seller = seller;
        this.isOrderDone = isOrderDone;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public boolean isOrderComplite() {
        return isOrderDone;
    }
}
