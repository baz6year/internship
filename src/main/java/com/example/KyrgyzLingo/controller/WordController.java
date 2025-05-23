package com.example.KyrgyzLingo.controller;

import com.example.KyrgyzLingo.dto.WordDTO;
import com.example.KyrgyzLingo.service.WordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/words")
public class WordController {

    private final WordService wordService;

    public WordController(WordService wordService) {
        this.wordService = wordService;
    }

    @PostMapping
    public ResponseEntity<WordDTO> createWord(@RequestBody WordDTO wordDto) {
        return ResponseEntity.ok(wordService.createWord(wordDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<WordDTO> getWordById(@PathVariable Long id) {
        return ResponseEntity.ok(wordService.getWordById(id));
    }

    @GetMapping
    public ResponseEntity<List<WordDTO>> getAllWords() {
        return ResponseEntity.ok(wordService.getAllWords());
    }

    @PutMapping("/{id}")
    public ResponseEntity<WordDTO> updateWord(@PathVariable Long id, @RequestBody WordDTO wordDto) {
        return ResponseEntity.ok(wordService.updateWord(id, wordDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteWord(@PathVariable Long id) {
        wordService.deleteWord(id);
        return ResponseEntity.noContent().build();
    }
}
