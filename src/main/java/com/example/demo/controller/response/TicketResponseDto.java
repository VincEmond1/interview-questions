package com.example.demo.controller.response;

import java.time.Instant;

public class TicketResponseDto {

    private final String eventName;

    private final Instant eventDate;

    private final float totalPrice;

    private final String seatRow;

    private final String seatNumber;

    public TicketResponseDto(String eventName, Instant eventDate, float totalPrice, String seatRow, String seatNumber) {
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.totalPrice = totalPrice;
        this.seatRow = seatRow;
        this.seatNumber = seatNumber;
    }
}
