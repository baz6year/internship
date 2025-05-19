package com.example.KyrgyzLingo.entity;

import jakarta.persistence.Entity;

@Entity

public class User {
    Long id;
    String username;
    String email;
    String password;
}
