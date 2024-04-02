package com.example.shop.mapper;

import com.example.shop.dto.UserDTO;
import com.example.shop.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "roles", target = "roles")
    UserDTO userToUserDTO(User user);
}