package com.example.service;

import com.example.dtos.NewsDto;
import com.example.model.Author;
import com.example.model.Comment;
import com.example.model.News;
import com.example.repository.CommentRepository;
import com.example.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class NewsService {
    @Autowired
    NewsRepository repo;
    @Autowired
    CommentRepository commentRepository;
    public News addNews(NewsDto news) {
        News newsEntity = new News();
        if (news.getStatus() == null){
            newsEntity.setStatus("Pending");
        }
        newsEntity.setNews(news.getNews());
        newsEntity.setAuthor(new Author(news.getAuthorId()));
        return repo.save(newsEntity);
    }

    public News updateNewsStatus(@PathVariable int id, NewsDto newsDto){
        News news;
        news = repo.getReferenceById(id);
        news.setStatus(newsDto.getStatus());
        return repo.save(news);
    }

       public List<News> getNewByStatus(String status){
            return repo.findByStatus(status);
        }

    public Comment addComment(Comment comment){
        comment.setComment(comment.getComment());
        comment.setCustomer(comment.getCustomer());
        comment.setNews(comment.getNews());
        return commentRepository.save(comment);
    }
}
