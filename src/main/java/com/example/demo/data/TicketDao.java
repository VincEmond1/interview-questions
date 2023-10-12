package com.example.demo.data;

import com.example.demo.domain.Ticket;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class TicketDao {

    private final Map<String, List<Ticket>> ticketsByUser;

    public TicketDao() {
        this.ticketsByUser = new HashMap<>();
    }

    public List<Ticket> getTickets(String userId) {
        return ticketsByUser.get(userId);
    }
}
