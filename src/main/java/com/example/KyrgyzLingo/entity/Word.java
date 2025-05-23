package com.example.KyrgyzLingo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "words")
public class Word {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String kyrgyzWord;

    @Column(nullable = false)
    private String translation;

    private String transcription;

    @ManyToOne
    private Topic topic;
}