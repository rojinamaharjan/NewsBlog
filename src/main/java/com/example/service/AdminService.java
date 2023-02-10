package com.example.service;

import com.example.model.Admin;
import com.example.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    AdminRepository repo;

    public Admin addAdmin(Admin admin) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encrypt = bCryptPasswordEncoder.encode(admin.getPassword());
        admin.setPassword(encrypt);
        return repo.save(admin);
    }
}
