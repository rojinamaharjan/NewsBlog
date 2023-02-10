package com.example.repository;

import com.example.model.News;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News, Integer> {

    List<News> findByStatus(String status);
}
