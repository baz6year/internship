package com.example.KyrgyzLingo.mapper;

import com.example.KyrgyzLingo.dto.WordDTO;
import com.example.KyrgyzLingo.entity.Word;

public interface WordMapper {
    WordDTO toDto(Word word);
    Word toEntity(WordDTO dto);
}
