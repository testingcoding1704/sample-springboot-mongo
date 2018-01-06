package com.example.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {
    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!, please use / to get mongo data";
    }
}