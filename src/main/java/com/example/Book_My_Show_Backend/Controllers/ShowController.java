package com.example.Book_My_Show_Backend.Controllers;

import com.example.Book_My_Show_Backend.Dtos.ShowByTimeRequestDto;
import com.example.Book_My_Show_Backend.Dtos.ShowRequestDto;
import com.example.Book_My_Show_Backend.Dtos.ShowResponseDto;
import com.example.Book_My_Show_Backend.Service.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/show")
public class ShowController {

    @Autowired
    ShowService showService;

    @PostMapping("/add")
    public String add(@RequestBody() ShowRequestDto showRequestDto){
        return  showService.add(showRequestDto);
    }

    @GetMapping("showsByMovieIdandtime")

    public List<ShowResponseDto> findshowsBymovieidandtime(@RequestBody() ShowByTimeRequestDto showByTimeRequestDto){
        return showService.findshowsBymovieidandtime(showByTimeRequestDto);
    }
}