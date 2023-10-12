package com.example.demo.domain;

import java.time.Instant;
import java.util.List;

public class Ticket {

    private final String eventName;

    private final Instant eventDate;

    private final int price;

    private final int taxPercentage;

    private final List<Item> additionalItems;

    private final String seatRow;

    private final String seatNumber;


    public Ticket(String eventName, Instant eventDate, int price, int taxPercentage, List<Item> additionalItems, String seatRow,
                  String seatNumber) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.price = price;
        this.taxPercentage = taxPercentage;
        this.additionalItems = additionalItems;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }
}
