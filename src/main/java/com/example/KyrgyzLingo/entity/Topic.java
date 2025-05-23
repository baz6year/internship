package com.example.KyrgyzLingo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "topics")
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

}
