package com.example.demo.service;

import com.example.demo.domain.Ticket;
import com.example.demo.domain.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketsService {

    @Autowired
    private final TicketRepository ticketRepository;

    public TicketsService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> findTickets(String userId) {
        return ticketRepository.getTickets(userId);
    }
}
