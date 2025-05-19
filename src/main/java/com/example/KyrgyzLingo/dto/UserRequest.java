package com.example.KyrgyzLingo.dto;

import lombok.Data;

@Data
public class UserRequest {
    Long id;
    String username;
    String email;
    String password;
}
