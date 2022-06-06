package com.kodilla.good.patterns.challenges.alibaba;

public class ProductOrderService {

    public boolean sell(BuyNow buyNow) {
        System.out.println("Zamówienie zostało złożone, dziękujemy " + buyNow.getUser().getName() + " " + buyNow.getUser().getSurname()
                +  " zakupiłeś: " +buyNow.getThing() + " do zapłaty będzie " + buyNow.getPrice() + " dolarów.");
        return true;
    }
}
