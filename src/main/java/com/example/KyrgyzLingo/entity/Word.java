package com.example.KyrgyzLingo.entity;

import jakarta.persistence.*;

@Entity
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

    private String topic;

    public Word() {
    }

    public Word(String kyrgyzWord, String translation, String transcription, String topic) {
        this.kyrgyzWord = kyrgyzWord;
        this.translation = translation;
        this.transcription = transcription;
        this.topic = topic;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getKyrgyzWord() {
        return kyrgyzWord;
    }

    public void setKyrgyzWord(String kyrgyzWord) {
        this.kyrgyzWord = kyrgyzWord;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}