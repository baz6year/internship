package com.example.KyrgyzLingo.mapper;

import com.example.KyrgyzLingo.dto.TopicRequest;
import com.example.KyrgyzLingo.dto.TopicResponse;
import com.example.KyrgyzLingo.entity.Topic;

import java.util.List;

public interface TopicMapper {
    Topic toTopic(TopicRequest topicRequest);
    TopicResponse toTopicResponse(Topic topic);
    List<TopicResponse> toResponses(List<Topic> topics);
}
