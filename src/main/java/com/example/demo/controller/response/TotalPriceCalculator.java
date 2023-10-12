package com.example.demo.controller.response;

import com.example.demo.domain.Ticket;
import org.springframework.stereotype.Component;

@Component
public class TotalPriceCalculator {

    public float computeTotalPrice(Ticket ticket) {
        var ticketTotal = 0;

        ticketTotal += ticket.getPrice() * ticket.getTaxPercentage();
        var itemsTotal = ticket.getAdditionalItems().stream().map(item -> item.getPrice() * item.getTaxPercentage()).reduce(0F, Float::sum);

        return ticketTotal + itemsTotal;
    }
}
