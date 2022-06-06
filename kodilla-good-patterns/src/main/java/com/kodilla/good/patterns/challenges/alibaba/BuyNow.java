package com.kodilla.good.patterns.challenges.alibaba;

public class BuyNow {

    public User user;
    public String thing;
    public int price;

    public BuyNow(User user, String thing, int price) {
        this.user = user;
        this.thing = thing;
        this.price = price;
    }

    public User getUser() {
        return user;
    }

    public String getThing() {
        return thing;
    }

    public int getPrice() {
        return price;
    }
}
