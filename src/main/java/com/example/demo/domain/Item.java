package com.example.demo.domain;

public class Item {

    private final int price;

    private final int taxPercentage;

    private final String name;

    public Item(int price, int taxPercentage, String name) {
        this.price = price;
        this.taxPercentage = taxPercentage;
        this.name = name;
    }
}
