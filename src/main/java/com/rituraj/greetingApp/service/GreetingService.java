package com.rituraj.greetingApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class GreetingService {

    public String getGreeting() {
        return "{\"message\": \"Hello, this is a GET request!\"}";
    }


    public String createGreeting(){
        return "{\"message\": \"Hello, this is a POST request!\"}";
    }


    public String updateGreeting() {
        return "{\"message\": \"Hello, this is a PUT request!\"}";
    }


    public String deleteGreeting() {
        return "{\"message\": \"Hello, this is a DELETE request!\"}";
    }
}
