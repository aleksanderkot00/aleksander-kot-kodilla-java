package com.kodilla.good.patterns.challanges;

public class ProductOrderRepository implements OrderRepository {
    @Override
    public void createRental(OrderRequest orderRequest) {
        System.out.println("Saving order request to repository.");
    }
}
