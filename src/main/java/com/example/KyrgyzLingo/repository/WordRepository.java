package com.example.KyrgyzLingo.repository;

import com.example.KyrgyzLingo.entity.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Long> {

    List<Word> findByTopic(String topic);
    List<Word> findByKyrgyzWordContainingIgnoreCase(String kyrgyzWord);
    List<Word> findByTranslationContainingIgnoreCase(String translation);
}

