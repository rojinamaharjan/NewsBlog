package com.example.controller;

import com.example.dtos.NewsDto;
import com.example.model.Comment;
import com.example.model.News;
import com.example.service.NewsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NewsController {
    private final NewsService service;

    public NewsController(NewsService service) {
        this.service = service;
    }

    @PostMapping("/news/addNews")
    public News addNews(@RequestBody NewsDto news) {
        return service.addNews(news);
    }

    @PutMapping("/news/updateNewsStatus/{id}")
    public News updateNewsStatus(@PathVariable int id,@RequestBody NewsDto news) {
        return service.updateNewsStatus(id,news);
    }

    @GetMapping("/news/getNews")
    public List<News> getAllNews() {
        return service.getNewByStatus("Approved");
    }
    @PutMapping("/news/addComment")
    public Comment addComment(@RequestBody Comment comment){
        return service.addComment(comment);
    }
}

