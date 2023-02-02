package com.example.Book_My_Show_Backend.Controllers;


import com.example.Book_My_Show_Backend.Dtos.MovieRequestDto;
import com.example.Book_My_Show_Backend.Dtos.TheaterResponseDto;
import com.example.Book_My_Show_Backend.Models.MovieEntity;
import com.example.Book_My_Show_Backend.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/add")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){

        return movieService.addMovie(movieRequestDto);
    }
    @GetMapping("/findByName")
    public MovieEntity findByName(@RequestParam("moviename") String moviename){
        return movieService.findByName(moviename);
    }


    //findall
    @GetMapping("/findall")
    public List<MovieEntity> findAll(){
        return movieService.findAll();
    }

    @GetMapping("/getTheaterlist")
    public  List<TheaterResponseDto> findtheatersbyMovie(@RequestParam("moviename") String moviename){
        return movieService.findtheatersbyMovie(moviename);
    }
}
