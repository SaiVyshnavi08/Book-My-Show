package com.example.Book_My_Show_Backend.Models;

import com.example.Book_My_Show_Backend.Enum.SeatType;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="theater_seat")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class TheaterSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String seatno;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private int rate;

    @ManyToOne
    @JoinColumn
    private  TheaterEntity theater;

    public TheaterSeatEntity(String seatno, SeatType seatType, int rate) {
        this.seatno = seatno;
        this.seatType = seatType;
        this.rate = rate;
    }
}

