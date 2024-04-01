package com.example.shop.controller;

import com.example.shop.dto.UserDTO;
import com.example.shop.dto.UserRbacDTO;
import com.example.shop.mapper.UserMapper;
import com.example.shop.model.User;
import com.example.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {
    private final UserService userService;
    private final UserMapper userMapper;
//    @GetMapping
//    public List<UserRbacDTO> listUser() {
//        return userService.getListUser();
//    }
    @GetMapping
    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return users;
    }
}
