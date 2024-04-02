package com.example.shop.controller;

import com.example.shop.dto.UserDTO;
import com.example.shop.model.User;
import com.example.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final UserService userService;
    @GetMapping("/user")
    public List<User> listUser() {
        return userService.getAllUsers();
    }
    @GetMapping("/userDTO")
    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = userService.getAllUserDTOs();
        return users;
    }
}
