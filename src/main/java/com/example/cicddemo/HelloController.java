package com.example.cicddemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello CI/CD World!";
    }

    @GetMapping("/api/version")
    public String version() {
        return "Application Version 1.0";
    }
}