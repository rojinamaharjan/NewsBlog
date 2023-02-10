package com.example.controller;

import com.example.model.Author;
import com.example.service.AuthorService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private final AuthorService service;
    public  AuthorController( AuthorService service){
        this.service = service;
    }
    @PostMapping("/author/addAuthor")
    public Author addAuthor(@RequestBody Author author){
        return service.addAuthor(author);
    }
}
