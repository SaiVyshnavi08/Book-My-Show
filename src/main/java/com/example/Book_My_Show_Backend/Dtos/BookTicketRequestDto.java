package com.example.Book_My_Show_Backend.Dtos;

import lombok.Data;

import java.util.List;

@Data
public class BookTicketRequestDto {

    private List<String> requestseats;

    private int showid;

    private int userid;
}