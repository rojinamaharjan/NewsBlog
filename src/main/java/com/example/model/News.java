package com.example.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String news;

    @ManyToOne
    @JoinColumn(name= "authorId")
    private Author author;

    @ManyToMany
    @JoinColumn(name="customerId")
    private List<Customer> customer;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return (Customer) customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = (List<Customer>) customer;
    }
}
