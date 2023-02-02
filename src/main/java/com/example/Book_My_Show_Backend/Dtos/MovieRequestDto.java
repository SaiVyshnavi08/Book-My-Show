package com.example.Book_My_Show_Backend.Dtos;

import lombok.Data;

import java.util.Date;

@Data

public class MovieRequestDto {
    private String name;
    private Date releaseDate;
    private int duration;
}
