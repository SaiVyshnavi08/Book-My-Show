package com.example.Book_My_Show_Backend.Repository;

import com.example.Book_My_Show_Backend.Models.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MovieRepository extends JpaRepository<MovieEntity,Integer> {
    MovieEntity findByMovieName(String moviename);

}
