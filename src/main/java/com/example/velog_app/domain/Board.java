package com.example.velog_app.domain;

import jakarta.persistence.*;

@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;              // 제목
    @Column(length = 2000)
    private String content;            // 본문
    private String thumbnailUrl;       // 썸네일 이미지url
    private String writerName;         // 작성자 이름
    private String writerProfileUrl;   // 작성자 프로필 사진url
    private int heartCount;            // 하트수
    public Board() {}

    public Board(String title, String content, String thumbnailUrl, String writerName, String writerProfileUrl, int heartCount) {
        this.title = title;
        this.content = content;
        this.thumbnailUrl = thumbnailUrl;
        this.writerName = writerName;
        this.writerProfileUrl = writerProfileUrl;
        this.heartCount = heartCount;
    }

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }
    public String getThumbnailUrl() { return thumbnailUrl; }
    public String getWriterName() { return writerName; }
    public String getWriterProfileUrl() { return writerProfileUrl; }
    public int getHeartCount() { return heartCount; }

    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
    public void setThumbnailUrl(String thumbnailUrl) { this.thumbnailUrl = thumbnailUrl; }
    public void setWriterName(String writerName) { this.writerName = writerName; }
    public void setWriterProfileUrl(String writerProfileUrl) { this.writerProfileUrl = writerProfileUrl; }
    public void setHeartCount(int heartCount) { this.heartCount = heartCount; }
}