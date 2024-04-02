package com.example.shop.service.serviceImpl;

import com.example.shop.dto.UserDTO;
import com.example.shop.mapper.UserMapper;
import com.example.shop.model.User;
import com.example.shop.repository.UserRepository;
import com.example.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<UserDTO> getAllUserDTOs() {
        return userRepository.findAll().stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }
}
