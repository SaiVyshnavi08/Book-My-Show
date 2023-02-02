package com.example.Book_My_Show_Backend.Dtos;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data

public class ShowByTimeRequestDto {

    private LocalDate showdate;

    private LocalTime starttime;

    private LocalTime endtime;

    private int movieid;
}
