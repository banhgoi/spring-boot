package com.example.shop.mapper.impl;

import com.example.shop.dto.RoleDTO;
import com.example.shop.dto.UserDTO;
import com.example.shop.mapper.UserMapper;
import com.example.shop.model.Permission;
import com.example.shop.model.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

//@Component
//@Primary
public class CustomUserMapperImpl
//        implements UserMapper
{

//    @Override
//    public UserDTO userToUserDTO(User user) {
//        if (user == null) return null;
//        UserDTO userDTO = new UserDTO();
//        userDTO.setId(user.getId());
//        userDTO.setUsername(user.getUsername());
//        userDTO.setRoles(user.getRoles().stream().map(role -> {
//            RoleDTO roleDTO = new RoleDTO();
//            roleDTO.setRoleName(role.getRoleName());
//            roleDTO.setPermissions(role.getPermissions().stream().map(Permission::getPermissionName).collect(Collectors.toList()));
//            return roleDTO;
//        }).collect(Collectors.toList()));
//        return userDTO;
//    }
}
