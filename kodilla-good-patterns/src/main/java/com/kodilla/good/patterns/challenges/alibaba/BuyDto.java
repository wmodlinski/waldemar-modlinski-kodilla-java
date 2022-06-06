package com.kodilla.good.patterns.challenges.alibaba;

public class BuyDto {

    public User user;
    public boolean isBuyed;

    public BuyDto(User user, boolean isBuyed) {
        this.user = user;
        this.isBuyed = isBuyed;
    }

    public User getUser() {
        return user;
    }

    public boolean getIsBuyed() {
        return isBuyed;
    }
}
