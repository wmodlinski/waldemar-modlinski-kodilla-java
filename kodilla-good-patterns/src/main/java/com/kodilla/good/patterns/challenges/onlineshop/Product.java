package com.kodilla.good.patterns.challenges.onlineshop;

public class Product {

    private int index;
    private String name;
    private String type;
    private int quantity;

    public Product(int index, String name, String type, int quantity) {
        this.index = index;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Produkt { " +
                "Numer katalogowy = '" + index + '\'' +
                ", nazwa = '" + name + '\'' +
                ", kategoria = '" + type + '\'' +
                ", ilość na magazynie = '" + quantity + '\'' +
                '}';
    }
}
