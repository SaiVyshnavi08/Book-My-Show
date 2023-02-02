package com.example.Book_My_Show_Backend.Controllers;


import com.example.Book_My_Show_Backend.Dtos.UserRequestDto;
import com.example.Book_My_Show_Backend.Dtos.UserResponseDto;
import com.example.Book_My_Show_Backend.Models.UserEntity;
import com.example.Book_My_Show_Backend.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String  addUser(@RequestBody UserRequestDto userRequestDto){
    return userService.addUser(userRequestDto);
    }
    @GetMapping("/findByName")
    public List<UserEntity> getuserByName(@RequestParam("username") String username){
        return userService.getuserByName(username);
    }

    @GetMapping("/findAll")
    public List<UserResponseDto> findallUsers(){
        return userService.findallUsers();
    }
}
