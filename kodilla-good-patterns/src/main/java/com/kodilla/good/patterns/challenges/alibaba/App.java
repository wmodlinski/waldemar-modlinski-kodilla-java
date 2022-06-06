package com.kodilla.good.patterns.challenges.alibaba;

public class App {
    public static void main(String[] args) {

        BuyNowToys buyNowToys = new BuyNowToys();
        BuyNow buyNow = buyNowToys.buyToys();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(),
                new OrderRepository());
        orderProcessor.process(buyNow);

    }
}
