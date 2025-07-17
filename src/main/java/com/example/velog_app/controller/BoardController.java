package com.example.velog_app.controller;

import com.example.velog_app.domain.Board;
import com.example.velog_app.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.example.velog_app.dto.BoardResponseDto;
import java.util.stream.Collectors;

@CrossOrigin(origins={"http://localhost:5173","http://localhost:5174"})
@RestController
public class BoardController {
    private final BoardRepository boardRepository;

    // ★ yml이나 환경변수에서 서버 BASE URL 읽어오기
    @Value("${custom.server-base-url}")
    private String serverBaseUrl;


    public BoardController(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @GetMapping("/boards")
    public List<BoardResponseDto> getBoards() {
        return boardRepository.findAll().stream()
                .map(board -> new BoardResponseDto(board, serverBaseUrl))
                .collect(Collectors.toList());
    }

    @GetMapping("/boards/{id}")
    public BoardResponseDto getBoard(@PathVariable Long id) {
        Board board = boardRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new BoardResponseDto(board, serverBaseUrl);
    }
}
