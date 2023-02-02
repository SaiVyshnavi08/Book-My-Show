package com.example.Book_My_Show_Backend.Models;

import com.example.Book_My_Show_Backend.Models.ShowEntity;
import com.example.Book_My_Show_Backend.Models.TheaterSeatEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name ="theater")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TheaterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String city;

    private String address;

    //List of shows
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    List<ShowEntity> showEntityList;


    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    List<TheaterSeatEntity> theaterSeatEntityList;
}
