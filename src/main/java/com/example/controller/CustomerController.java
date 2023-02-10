package com.example.controller;

import com.example.model.Comment;
import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {
       private final CustomerService service;

    public CustomerController(CustomerService service){
           this.service = service;
       }
    @GetMapping("/customer/getCustomer")
    public Customer getCustomer(@RequestBody Customer customer){
        return (Customer) service.getCustomer();
    }

    @PostMapping("/customer/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

}
