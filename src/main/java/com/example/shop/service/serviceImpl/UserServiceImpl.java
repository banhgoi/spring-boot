package com.example.shop.service.serviceImpl;

import com.example.shop.dto.UserDTO;
import com.example.shop.dto.UserRbacDTO;
import com.example.shop.mapper.UserMapper;
import com.example.shop.model.Permission;
import com.example.shop.model.User;
import com.example.shop.repository.UserRepository;
import com.example.shop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    @Override
    public List<UserRbacDTO> getListUser() {
        /** List<User> users = userRepository.findAll();
        List<UserRbacDTO> userRbacDTOs = new ArrayList<>();
        users.stream().map(user -> {
            UserRbacDTO userRbacDTO = new UserRbacDTO();
            userRbacDTO.setUsername(user.getUsername());
            List<UserRbacDTO.RoleDTO> roles = new ArrayList<>();
            user.getRoles().stream().map(role -> {
                UserRbacDTO.RoleDTO roleDTO = new UserRbacDTO.RoleDTO();
                roleDTO.setRoleName(role.getRoleName());
                List<String> permissions = new ArrayList<>();
                role.getPermissions().stream().map(permission -> permissions.add(permission.getPermissionName())).collect(Collectors.toList());
                roleDTO.setPermissions(permissions);
                roles.add(roleDTO);
                return roleDTO;
            }).collect(Collectors.toList());
            userRbacDTO.setRoles(roles);
            userRbacDTOs.add(userRbacDTO);
            return userRbacDTO;
        }).collect(Collectors.toList());
        return userRbacDTOs; **/

        return userRepository.findAll().stream().map(user -> {
            UserRbacDTO userRbacDTO = new UserRbacDTO();
            userRbacDTO.setUsername(user.getUsername());

            List<UserRbacDTO.RoleDTO> roleDTOs = user.getRoles().stream().map(role -> {
                UserRbacDTO.RoleDTO roleDTO = new UserRbacDTO.RoleDTO();
                roleDTO.setRoleName(role.getRoleName());
                List<String> permissions = role.getPermissions().stream()
                        .map(Permission::getPermissionName)
                        .collect(Collectors.toList());
                roleDTO.setPermissions(permissions);
                return roleDTO;
            }).collect(Collectors.toList());

            userRbacDTO.setRoles(roleDTOs);
            return userRbacDTO;
        }).collect(Collectors.toList());
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }
}
