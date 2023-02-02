package com.example.Book_My_Show_Backend.Service;



import com.example.Book_My_Show_Backend.Dtos.MovieRequestDto;
import com.example.Book_My_Show_Backend.Dtos.TheaterResponseDto;
import com.example.Book_My_Show_Backend.Models.MovieEntity;
import com.example.Book_My_Show_Backend.Models.ShowEntity;
import com.example.Book_My_Show_Backend.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(MovieRequestDto movieRequestDto){

        //Convert Dto to Entity layer for saving it to the Database.
        MovieEntity movie = MovieEntity.builder().movieName(movieRequestDto.getName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();

        movieRepository.save(movie);

        return "Movie Added successfully";
    }
    public MovieEntity findByName(String moviename) {
        MovieEntity movie = null;
        try {
            movie = movieRepository.findByMovieName(moviename);
        } catch (Exception e) {
            System.out.println("Movie does not exist in db");
        }
        return movie;
    }

    public List<MovieEntity> findAll(){
        List<MovieEntity> movieEntityList = movieRepository.findAll();
        return  movieEntityList;
    }

    public  List<TheaterResponseDto> findtheatersbyMovie(String moviename){

        MovieEntity movie = movieRepository.findByMovieName(moviename);

        List<ShowEntity> showEntityList = movie.getShowEntityList();

        List<TheaterResponseDto> theaterResponseDtoList = new ArrayList<>();

        for(ShowEntity show: showEntityList){

            TheaterResponseDto theaterResponseDto = TheaterResponseDto.builder().name(show.getTheater().getName())
                    .address(show.getTheater().getAddress()).city(show.getTheater().getCity()).build();


            theaterResponseDtoList.add(theaterResponseDto);

        }

        return theaterResponseDtoList;
    }


}



