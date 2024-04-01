package com.example.shop.service;

import com.example.shop.dto.UserDTO;
import com.example.shop.dto.UserRbacDTO;
import com.example.shop.model.User;

import java.util.List;

public interface UserService {
    List<UserRbacDTO> getListUser();
    List<UserDTO> getAllUsers();
}
