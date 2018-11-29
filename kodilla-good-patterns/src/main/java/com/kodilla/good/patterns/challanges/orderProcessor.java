package com.kodilla.good.patterns.challanges;

public class orderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private RentalRepository rentalRepository;

    public orderProcessor(InformationService informationService, ProductOrderService productOrderService, RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.rentalRepository = rentalRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrderComplite = productOrderService.compliteOrder();

        if(isOrderComplite) {
            informationService.inform(orderRequest.getBuyer());
            informationService.inform(orderRequest.getSeller();
            rentalRepository.createRental(orderRequest);
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getSeller(), true);
        } else {
            return new OrderDto(orderRequest.getBuyer(), orderRequest.getSeller(), false);
        }
    }
}
