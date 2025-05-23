package com.example.KyrgyzLingo.controller;

import com.example.KyrgyzLingo.dto.TopicRequest;
import com.example.KyrgyzLingo.dto.TopicResponse;
import com.example.KyrgyzLingo.entity.Topic;
import com.example.KyrgyzLingo.service.TopicService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/topic")
public class TopicController {
    private TopicService topicService;
    @PostMapping("/create")
    public Topic createTopic(TopicRequest request){
        return topicService.createTopic(request);
    }
    @GetMapping("/getAll")
    public List<TopicResponse> getAllTopics(){
        return topicService.getAllTopics();
    }
    @GetMapping("/getById")
    public Topic getTopicById(Long id){
        return topicService.getTopicById(id);
    }
    @DeleteMapping("/delete")
    public void deleteTopic(String title){
        topicService.deleteTopic(title);
    }

}
