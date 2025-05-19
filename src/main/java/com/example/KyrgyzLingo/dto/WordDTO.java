package com.example.KyrgyzLingo.dto;

public class WordDTO {

    private Long id;
    private String kyrgyzWord;
    private String translation;
    private String transcription;
    private String topic;

    public WordDTO() {
    }

    public WordDTO(Long id, String kyrgyzWord, String translation, String transcription, String topic) {
        this.id = id;
        this.kyrgyzWord = kyrgyzWord;
        this.translation = translation;
        this.transcription = transcription;
        this.topic = topic;
    }

    public Long getId() {
        return id;
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
