package com.example.demo.controller.response;

import com.example.demo.domain.Ticket;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketsResponseAssembler {

    private final TotalPriceCalculator totalPriceCalculator;

    public TicketsResponseAssembler() {
        this.totalPriceCalculator = new TotalPriceCalculator();
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
