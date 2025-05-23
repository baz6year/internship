package com.example.KyrgyzLingo.repository;

import com.example.KyrgyzLingo.entity.Topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Long> {
    void deleteByTitle(String title);
}
