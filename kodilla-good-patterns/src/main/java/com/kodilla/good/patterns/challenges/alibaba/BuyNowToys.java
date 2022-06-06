package com.kodilla.good.patterns.challenges.alibaba;

public class BuyNowToys {

    public BuyNow buyToys() {

        User user = new User("Zdzisław", "Nowak");
        String thing = "Pluszowy Miś";
        int price = 30;

        return new BuyNow(user, thing, price);
    }
}
