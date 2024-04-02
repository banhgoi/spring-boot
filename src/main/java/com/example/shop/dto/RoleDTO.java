package com.example.shop.dto;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class RoleDTO {
    private String roleName;
    private Set<PermissionDTO> permissions;
}
