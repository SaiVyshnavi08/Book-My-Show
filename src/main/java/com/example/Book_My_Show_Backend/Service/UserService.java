package com.example.Book_My_Show_Backend.Service;

import com.example.Book_My_Show_Backend.Dtos.TicketResponseDto;
import com.example.Book_My_Show_Backend.Dtos.UserRequestDto;
import com.example.Book_My_Show_Backend.Dtos.UserResponseDto;
import com.example.Book_My_Show_Backend.Models.TicketEntity;
import com.example.Book_My_Show_Backend.Models.UserEntity;
import com.example.Book_My_Show_Backend.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserRequestDto userRequestDto){

        UserEntity user = UserEntity.builder().name(userRequestDto.getName()).mobile(userRequestDto.getMobile()).build();

        try {
            userRepository.save(user);
        }
        catch (Exception e){
            return "Error User cannot be added";
        }

        return "Successfully added a user!";
    }

    public List<UserEntity> getuserByName(String username){

        List<UserEntity> userEntityList = userRepository.findByName(username);

        return  userEntityList;
    }


    public List<UserResponseDto> findallUsers(){

        List<UserEntity> userEntityList= userRepository.findAll();
        List<UserResponseDto> userResponseDtoList = new ArrayList<>();

        for(UserEntity user: userEntityList){
            UserResponseDto userResponseDto = UserResponseDto.builder().name(user.getName()).mobile(user.getMobile()).build();
            List<TicketEntity> ticketEntityList = user.getTicketEntityList();
            List<TicketResponseDto> ticketResponseDtoList = new ArrayList<>();
            for(TicketEntity ticketEntity: ticketEntityList){
                TicketResponseDto ticketResponseDto = TicketResponseDto.builder().alloted_seats(ticketEntity.getAlloted_seats())
                        .bookedAt(ticketEntity.getBooked_at()).amount(ticketEntity.getAmount()).build();

                ticketResponseDtoList.add(ticketResponseDto);
            }
            userResponseDto.setTicketResponseDtoList(ticketResponseDtoList);
            userResponseDtoList.add(userResponseDto);
        }

        return  userResponseDtoList;
    }
}

