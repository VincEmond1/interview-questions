package com.example.demo.domain;

import com.example.demo.data.TicketDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketRepository {

    @Autowired
    private final TicketDao ticketDao;

    public TicketRepository(TicketDao ticketDao) {
        this.ticketDao = ticketDao;
    }

    public List<Ticket> getTickets(String userId) {
        return ticketDao.getTickets(userId);
    }

}
