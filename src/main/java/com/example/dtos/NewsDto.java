package com.example.dtos;

public class NewsDto {
    private int id;
    private String news;
    private int authorId;
    private String status;

    public NewsDto() {

    }

    public NewsDto(int id, String news, String status, int authorId) {
        this.id = id;
        this.news = news;
        this.authorId = authorId;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
