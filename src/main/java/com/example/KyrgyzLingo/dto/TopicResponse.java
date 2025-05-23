package com.example.KyrgyzLingo.dto;

public class TopicResponse {
    private Long id;
    private String title;

    public TopicResponse() {
    }

    public TopicResponse(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
