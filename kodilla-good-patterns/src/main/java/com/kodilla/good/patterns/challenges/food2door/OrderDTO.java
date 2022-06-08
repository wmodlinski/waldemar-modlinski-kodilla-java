package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {

    public String productName;
    public int productQuantity;

    public OrderDTO(String productName, int productQuantity) {
        this.productName = productName;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}
