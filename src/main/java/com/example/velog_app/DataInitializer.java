package com.example.velog_app;

import com.example.velog_app.domain.Board;
import com.example.velog_app.repository.BoardRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BoardRepository boardRepository;

    public DataInitializer(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    @Override
    public void run(String... args) {
        if (boardRepository.count() == 0) {
            boardRepository.save(new Board("제목1", "본문1 본문내용입니다웅"));
            boardRepository.save(new Board("제목2", "본문2 제방라러미ㅏㅇ러미"));
            boardRepository.save(new Board("제목3", "본문3 테으스트트"));
            boardRepository.save(new Board("제목4", "본문4 테스트테스트"));
            boardRepository.save(new Board("제목5", "본문5 살아숨셔는 들어봤냐"));
            boardRepository.save(new Board("제목6", "본문6 염따 "));
        }
    }
}
