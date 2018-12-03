package com.kodilla.good.patterns.food2Door;

public class Main {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        ProducerResourcesRetriever resourcesRetriever = new ProducerResourcesRetriever();
        Producer producer = new ExtraFoodShop(resourcesRetriever.retrieve());

        DeliveryProcessor deliveryProcessor = new DeliveryProcessor(producer, order);
        deliveryProcessor.process();
    }
}
