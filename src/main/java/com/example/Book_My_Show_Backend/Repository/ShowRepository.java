package com.example.Book_My_Show_Backend.Repository;

import com.example.Book_My_Show_Backend.Models.ShowEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShowRepository  extends JpaRepository<ShowEntity,Integer> {

}
