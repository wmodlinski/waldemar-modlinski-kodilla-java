package com.kodilla.good.patterns.challenges.alibaba;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                          final ProductOrderService productOrderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public BuyDto process(final BuyNow buyNow) {
        boolean isBuyed = productOrderService.sell(buyNow);

        if(isBuyed) {
            informationService.inform(buyNow);
            orderRepository.createOrder(buyNow);
            return new BuyDto(buyNow.getUser(), true);
        } else {
            return new BuyDto(buyNow.getUser(), false);
        }
    }
}
