package com.example.KyrgyzLingo.mapper.Impl;

import com.example.KyrgyzLingo.dto.TopicRequest;
import com.example.KyrgyzLingo.dto.TopicResponse;
import com.example.KyrgyzLingo.entity.Topic;
import com.example.KyrgyzLingo.mapper.TopicMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TopicMapperImpl implements TopicMapper {
    @Override
    public Topic toTopic(TopicRequest topicRequest) {
        Topic topic = new Topic();
        topic.setTitle(topicRequest.getTitle());
        return topic;
    }

    @Override
    public TopicResponse toTopicResponse(Topic topic) {
        TopicResponse response = new TopicResponse();
        response.setId(topic.getId());
        response.setTitle(topic.getTitle());
        return response;
    }

    @Override
    public List<TopicResponse> toResponses(List<Topic> topics) {
        return topics.stream()
                .map(this::toTopicResponse)
                .collect(Collectors.toList());
    }
}
