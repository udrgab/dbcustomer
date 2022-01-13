package com.project.customerservice.controller;

import com.project.customerservice.Person;
import com.project.customerservice.service.DbServiceClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    private final DbServiceClient customerService;

    public CustomerController(DbServiceClient customerService) {
        this.customerService = customerService;
    }

    @RequestMapping("/persons/{id}")
    public Person getPerson(@PathVariable Long id){
        return customerService.getPerson(id);
    }
}

