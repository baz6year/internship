package com.example.KyrgyzLingo.service;

import com.example.KyrgyzLingo.dto.WordDTO;
import com.example.KyrgyzLingo.entity.Word;

import java.util.List;

public interface WordService {
    WordDTO createWord(WordDTO wordDto);
    WordDTO getWordById(Long id);
    List<WordDTO> getAllWords();
    WordDTO updateWord(Long id, WordDTO wordDto);
    void deleteWord(Long id);
    List<WordDTO> getWordsByTopic(String topic); // поиск по теме
}

