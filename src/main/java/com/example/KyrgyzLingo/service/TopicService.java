package com.example.KyrgyzLingo.service;

import com.example.KyrgyzLingo.dto.TopicRequest;
import com.example.KyrgyzLingo.dto.TopicResponse;
import com.example.KyrgyzLingo.entity.Topic;

import java.util.List;

public interface TopicService {
    Topic createTopic(TopicRequest request);
    List<TopicResponse> getAllTopics();
    Topic getTopicById(Long id);
    void deleteTopic(String title);
}
