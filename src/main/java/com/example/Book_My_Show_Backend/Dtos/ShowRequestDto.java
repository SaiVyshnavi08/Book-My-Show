package com.example.Book_My_Show_Backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class ShowRequestDto {

    private LocalDate showDate;

    private LocalTime showTime;

    private double multiplier;

    private String moviename;

    private int theaterid;
}
