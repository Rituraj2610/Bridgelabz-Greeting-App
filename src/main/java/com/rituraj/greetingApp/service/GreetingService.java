package com.rituraj.greetingApp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Service
public class GreetingService {

    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            return String.format("Hello, %s %s!", firstName, lastName);
        } else if (firstName != null) {
            return String.format("Hello, %s!", firstName);
        } else if (lastName != null) {
            return String.format("Hello, %s!", lastName);
        } else {
            return "Hello World!";
        }
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
