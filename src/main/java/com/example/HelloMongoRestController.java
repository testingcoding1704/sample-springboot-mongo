package com.example;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMongoRestController {
    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/")
    public String helloMongo() {
        List<Customer> customers = repository.findAll();
        StringBuilder result = new StringBuilder();
        result.append("Hello mongo!!!\n");
        result.append("Customers:\n");
        for (Customer customer : customers) {
            result.append("  ").append(customer.toString()).append("\n");
        }
        return result.toString();
    }
}