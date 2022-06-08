package com.kodilla.good.patterns.challenges.food2door;

public class CollectionContractors {

    public static final String EXTRA_FOOD_SHOP = "ExtraFoodShop";
    public static final String HEALTHY_SHOP = "HealthyShop";
    public static final String GLUTEN_FREE_SHOP = "GlutenFreeShop";

    public Contractor getContractor(String contractorName) {
        if (contractorName.equalsIgnoreCase(EXTRA_FOOD_SHOP)) {
            return new ExtraFoodShop(EXTRA_FOOD_SHOP);
        } else if (contractorName.equalsIgnoreCase(HEALTHY_SHOP)) {
            return new HealthyShop(HEALTHY_SHOP);
        } else if (contractorName.equalsIgnoreCase(GLUTEN_FREE_SHOP)) {
            return new GlutenFreeShop(GLUTEN_FREE_SHOP);
        } else {
            System.out.println("Uwaga, nie wybrano dostawcy!");
            return null;
        }
    }
}
