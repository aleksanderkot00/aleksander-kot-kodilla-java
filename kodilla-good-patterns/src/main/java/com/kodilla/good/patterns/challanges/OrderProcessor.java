package com.kodilla.good.patterns.challanges;

public class OrderProcessor {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrderDone = orderService.executeOrder(orderRequest);

        if(isOrderDone) {
            informationService.inform(orderRequest.getBuyer());
            informationService.inform(orderRequest.getSeller());
            orderRepository.createRental(orderRequest);
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getSeller(), true);
        } else {
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getSeller(), false);
        }
    }
}
