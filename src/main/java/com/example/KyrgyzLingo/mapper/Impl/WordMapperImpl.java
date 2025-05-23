package com.example.KyrgyzLingo.mapper.Impl;

import com.example.KyrgyzLingo.dto.WordDTO;
import com.example.KyrgyzLingo.entity.Word;
import com.example.KyrgyzLingo.mapper.WordMapper;
import org.springframework.stereotype.Component;

@Component
public class WordMapperImpl implements WordMapper {

    @Override
    public WordDTO toDto(Word word) {
        if (word == null) {
            return null;
        }
        WordDTO dto = new WordDTO();
        dto.setId(word.getId());
        dto.setKyrgyzWord(word.getKyrgyzWord());
        dto.setTranslation(word.getTranslation());
        dto.setTranscription(word.getTranscription());
        return dto;
    }

    @Override
    public Word toEntity(WordDTO dto) {
        if (dto == null) {
            return null;
        }
        Word word = new Word();
        if (dto.getId() != null) {
            word.setId(dto.getId());
        }
        word.setKyrgyzWord(dto.getKyrgyzWord());
        word.setTranslation(dto.getTranslation());
        word.setTranscription(dto.getTranscription());
        return word;
    }
}

