package com.example.Book_My_Show_Backend.Dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class TheaterRequestDto {

    private String name;

    private String city;

    private String address;
}
