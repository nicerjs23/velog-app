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
    private String createdAt;       // 추가
    private int commentCount;       // 추가

    public BoardResponseDto(Board board,  String serverBaseUrl) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.thumbnailUrl = serverBaseUrl + board.getThumbnailUrl();
        this.writerName = board.getWriterName();
        this.writerProfileUrl = serverBaseUrl + board.getWriterProfileUrl();
        this.heartCount = board.getHeartCount();
        this.createdAt = board.getCreatedAt();       // 추가
        this.commentCount = board.getCommentCount(); // 추가
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
    public String getCreatedAt() { return createdAt; }
    public int getCommentCount() { return commentCount; }
}
