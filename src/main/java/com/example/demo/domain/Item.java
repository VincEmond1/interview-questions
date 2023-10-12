package com.example.demo.domain;

public class Item {

    private final int price;

    private final float taxPercentage;

    private final String name;

    public Item(int price, float taxPercentage, String name) {
        this.price = price;
        this.taxPercentage = taxPercentage;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public float getTaxPercentage() {
        return taxPercentage;
    }

    public String getName() {
        return name;
    }
}
