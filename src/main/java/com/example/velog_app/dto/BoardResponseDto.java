package com.example.velog_app.dto;

import com.example.velog_app.domain.Board;

public class BoardResponseDto {
    private Long id;
    private String title;
    private String content;
    private String thumbnailUrl;
    private String writerName;
    private String writerProfileUrl;
    private int heartCount;

    public BoardResponseDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.thumbnailUrl = board.getThumbnailUrl();
        this.writerName = board.getWriterName();
        this.writerProfileUrl = board.getWriterProfileUrl();
        this.heartCount = board.getHeartCount();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public String getWriterName() {
        return writerName;
    }

    public String getWriterProfileUrl() {
        return writerProfileUrl;
    }

    public int getHeartCount() {
        return heartCount;
    }
}
