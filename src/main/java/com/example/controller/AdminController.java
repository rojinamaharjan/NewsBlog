package com.example.controller;

import com.example.model.Admin;
import com.example.repository.AdminRepository;
import com.example.service.AdminService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AdminController {

    private final AdminService service;
    public AdminController( AdminService service){
        this.service = service;
    }
    @PostMapping("/admin/addAdmin")
    public Admin addAdmin(@RequestBody Admin admin){
        return service.addAdmin(admin);
    }
}
