package com.example.shop.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserRbacDTO {
    private String username;
    private List<RoleDTO> roles;

    @Data
    public static class RoleDTO {
        private String roleName;
        private List<String> permissions;
    }
}
