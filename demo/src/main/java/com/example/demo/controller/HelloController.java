package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld!";
    }

    @GetMapping("/")
    public String root() {
        return "Hello from root!";
    }
}

