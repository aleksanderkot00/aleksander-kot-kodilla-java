package com.kodilla.good.patterns.challanges;

public interface RentalRepository {
    public void createRental(User buyer, User seller, Order order);
}
