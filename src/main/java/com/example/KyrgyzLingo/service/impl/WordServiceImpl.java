package com.example.KyrgyzLingo.service.impl;

import com.example.KyrgyzLingo.dto.WordDTO;
import com.example.KyrgyzLingo.entity.Word;
import com.example.KyrgyzLingo.exceptions.ResourceNotFoundException;
import com.example.KyrgyzLingo.mapper.WordMapper;
import com.example.KyrgyzLingo.repository.WordRepository;
import com.example.KyrgyzLingo.service.WordService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class WordServiceImpl implements WordService {

    private final WordRepository wordRepository;
    private final WordMapper wordMapper;

    @Override
    public WordDTO createWord(WordDTO wordDto) {
        Word word = wordMapper.toEntity(wordDto);
        Word saved = wordRepository.save(word);
        return wordMapper.toDto(saved);
    }

    @Override
    public WordDTO getWordById(Long id) {
        Word word = wordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Word not found with id: " + id));
        return wordMapper.toDto(word);
    }

    @Override
    public List<WordDTO> getAllWords() {
        return wordRepository.findAll()
                .stream()
                .map(wordMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public WordDTO updateWord(Long id, WordDTO wordDto) {
        Word existing = wordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Word not found with id: " + id));

        existing.setKyrgyzWord(wordDto.getKyrgyzWord());
        existing.setTranslation(wordDto.getTranslation());
        existing.setTranscription(wordDto.getTranscription());
        existing.setTopic(wordDto.getTopic());

        Word updated = wordRepository.save(existing);
        return wordMapper.toDto(updated);
    }

    @Override
    public void deleteWord(Long id) {
        Word word = wordRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Word not found with id: " + id));
        wordRepository.delete(word);
    }

    @Override
    public List<WordDTO> getWordsByTopic(String topic) {
        return wordRepository.findByTopicIgnoreCase(topic)
                .stream()
                .map(wordMapper::toDto)
                .collect(Collectors.toList());
    }
}
