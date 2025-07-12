package com.example.velog_app.controller;

import com.example.velog_app.domain.Board;
import com.example.velog_app.repository.BoardRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoardController {
    private final BoardRepository boardRepository;

    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("/boards")
    public List<Board> getBoards() {
        return boardRepository.findAll();
    }
    @GetMapping("/boards/{id}")
    public Board getBoard(@PathVariable Long id) {
        return boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
    }
}
