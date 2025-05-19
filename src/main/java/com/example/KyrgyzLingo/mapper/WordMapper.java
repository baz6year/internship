package com.example.KyrgyzLingo.mapper;

import com.example.KyrgyzLingo.dto.WordDTO;
import com.example.KyrgyzLingo.entity.Word;

public class WordMapper {

    public static WordDTO toDto(Word word) {
        if (word == null) {
            return null;
        }
        WordDTO dto = new WordDTO();
        dto.setId(word.getId());
        dto.setKyrgyzWord(word.getKyrgyzWord());
        dto.setTranslation(word.getTranslation());
        dto.setTranscription(word.getTranscription());
        dto.setTopic(word.getTopic());
        return dto;
    }
    public static Word toEntity(WordDTO dto) {
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
        word.setTopic(dto.getTopic());
        return word;
    }
}
