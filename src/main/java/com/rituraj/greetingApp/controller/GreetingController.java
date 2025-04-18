package com.rituraj.greetingApp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

    @GetMapping
    public String getGreeting() {
        return "{\"message\": \"Hello, this is a GET request!\"}";
    }

    @PostMapping
    public String createGreeting() {
        return "{\"message\": \"Hello, this is a POST request!\"}";
    }

    @PutMapping
    public String updateGreeting() {
        return "{\"message\": \"Hello, this is a PUT request!\"}";
    }

    @DeleteMapping
    public String deleteGreeting() {
        return "{\"message\": \"Hello, this is a DELETE request!\"}";
    }
}
