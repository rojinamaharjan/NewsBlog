package com.example.service;

import com.example.model.Comment;
import com.example.model.Customer;
import com.example.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repo;

    public Customer addCustomer(Customer customer) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String encrypt = bCryptPasswordEncoder.encode(customer.getPassword());
        customer.setPassword(encrypt);
        return repo.save(customer);
    }
    public List<Customer> getCustomer() {
        return repo.findAll();
    }


}
