package com.example.Book_My_Show_Backend.Repository;

import com.example.Book_My_Show_Backend.Models.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity,Integer> {

}
