package com.kodilla.good.patterns.food2Door;

public class DeliveryProcessor {

    private Producer producer;
    private Order order;

    public DeliveryProcessor(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public void process() {
        boolean a = producer.process(order);
        if (a) {
            System.out.println("We will deliver your products soon.");
        } else {
            System.out.println("We can't deliver your products, because of producer problems.");
        }
    }
}
