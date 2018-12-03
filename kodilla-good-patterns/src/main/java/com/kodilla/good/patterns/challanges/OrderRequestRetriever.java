package com.kodilla.good.patterns.challanges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User buyer = new User("Jan", "Kowalski", "Kołobrzeg, ul. jasna 15/4", "606343623");
        User seller = new User("Maciej", "Zieliński", "Koszalin, ul. lipowa 18", "884264948");
        Order order = new Order("Game", "23152",149.99,
                LocalDateTime.of(2018, 11,3,15,23),
                LocalDateTime.of(2018, 11,10,18,47));

        return new OrderRequest(buyer, seller, order);
    }
}
