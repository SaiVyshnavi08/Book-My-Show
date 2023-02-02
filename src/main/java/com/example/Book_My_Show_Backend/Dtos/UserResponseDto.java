package com.example.Book_My_Show_Backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class UserResponseDto {
    private String name;

    private String mobile;

    private List<TicketResponseDto> ticketResponseDtoList;
}
