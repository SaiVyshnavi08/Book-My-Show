package com.example.Book_My_Show_Backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
public class TicketResponseDto {

    private String alloted_seats;

    private int amount;

    private Date bookedAt;
}
