package com.example.demo.controller.response;

import com.example.demo.domain.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketsResponseAssembler {

    @Autowired
    private final TotalPriceCalculator totalPriceCalculator;

    public TicketsResponseAssembler(TotalPriceCalculator totalPriceCalculator) {
        this.totalPriceCalculator = totalPriceCalculator;
    }

    public TicketsResponseDto assemble(List<Ticket> tickets) {
        var ticketsDtos = tickets.stream()
            .map(ticket -> new TicketResponseDto(ticket.getEventName(),
                                                 ticket.getEventDate(),
                                                 totalPriceCalculator.computeTotalPrice(ticket),
                                                 ticket.getSeatRow(),
                                                 ticket.getSeatNumber()))
            .toList();

        return new TicketsResponseDto(ticketsDtos);
    }
}
