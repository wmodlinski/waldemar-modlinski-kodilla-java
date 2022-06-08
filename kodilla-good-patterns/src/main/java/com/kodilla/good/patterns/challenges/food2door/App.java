package com.kodilla.good.patterns.challenges.food2door;

import static com.kodilla.good.patterns.challenges.food2door.CollectionContractors.*;

public class App {

    public static void main(String[] args) {

        OrderProcessor orderProcessor = new OrderProcessor();

        OrderDTO order1 = new OrderDTO("Bagietka", 30);
        OrderDTO order2 = new OrderDTO("Sałatka nicejska", 15);
        OrderDTO order3 = new OrderDTO("Kozi ser", 10);

        orderProcessor.buyProcess(GLUTEN_FREE_SHOP, order1);
        orderProcessor.buyProcess(HEALTHY_SHOP, order2);
        orderProcessor.buyProcess(EXTRA_FOOD_SHOP, order3);
    }
}
