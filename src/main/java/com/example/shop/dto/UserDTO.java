package com.example.shop.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private Set<RoleDTO> roles;
    // Constructors, getters, and setters
}
