package com.example.demo.controller.response;

import java.util.List;

public class TicketsResponseDto {

    private final List<TicketResponseDto> responseDtos;

    public TicketsResponseDto(List<TicketResponseDto> responseDtos) {
        this.responseDtos = responseDtos;
    }
}
