package com.example.service;

import com.example.model.Author;
import com.example.repository.AdminRepository;
import com.example.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository repo;
    public Author addAuthor(Author author) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encrypt = bCryptPasswordEncoder.encode(author.getPassword());
        author.setPassword(encrypt);
        return repo.save(author);
    }
}
