package com.example.demo.controller;

import com.example.demo.controller.response.TicketsResponseDto;
import com.example.demo.domain.Ticket;
import com.example.demo.service.TicketsService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Path("/v1")
public class TicketsController {

    @Autowired
    private final TicketsService service;

    public TicketsController(TicketsService service) {
        this.service = service;
    }

    @GET
    @Path("/tickets/{userId}")
    public TicketsResponseDto getTickets(String userId) {
        List<Ticket> tickets = service.findTickets(userId);

        return null;
    }
}
