package com.example.KyrgyzLingo.service.impl;

import com.example.KyrgyzLingo.dto.TopicRequest;
import com.example.KyrgyzLingo.dto.TopicResponse;
import com.example.KyrgyzLingo.entity.Topic;
import com.example.KyrgyzLingo.mapper.TopicMapper;
import com.example.KyrgyzLingo.repository.TopicRepository;
import com.example.KyrgyzLingo.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    private final TopicRepository topicRepository;
    private final TopicMapper topicMapper;

    public TopicServiceImpl(TopicRepository topicRepository, TopicMapper topicMapper) {
        this.topicRepository = topicRepository;
        this.topicMapper = topicMapper;
    }

    @Override
    public Topic createTopic(TopicRequest topicRequest) {
        return topicRepository.save(topicMapper.toTopic(topicRequest));
    }

    @Override
    public List<TopicResponse> getAllTopics() {
        List<Topic> topics = topicRepository.findAll();
        return topicMapper.toResponses(topics);
    }

    @Override
    public Topic getTopicById(Long id) {
        return topicRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteTopic(String title) {
        topicRepository.deleteByTitle(title);
    }
}
