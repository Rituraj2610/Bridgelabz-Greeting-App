package com.rituraj.greetingApp.service;

import com.rituraj.greetingApp.model.Greeting;
import com.rituraj.greetingApp.repo.GreetingsRepo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.Optional;

@Service
public class GreetingService {

    private GreetingsRepo greetingsRepo;
    public GreetingService(GreetingsRepo greetingsRepo){
        this.greetingsRepo = greetingsRepo;
    }

    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            Greeting greeting = new Greeting(String.format("Hello, %s %s!", firstName, lastName));
            greetingsRepo.save(greeting);
            Optional<Greeting> optional = greetingsRepo.findById(1);
            if(optional.isPresent()){
                return optional.get().getMessage();
            }
        } else if (firstName != null) {
            Greeting greeting = new Greeting(String.format("Hello, %s %s!", firstName, lastName));
            greetingsRepo.save(greeting);
            Optional<Greeting> optional = greetingsRepo.findById(1);
            if(optional.isPresent()){
                return optional.get().getMessage();
            }
        } else if (lastName != null) {
            Greeting greeting = new Greeting(String.format("Hello, %s %s!", firstName, lastName));
            greetingsRepo.save(greeting);
            Optional<Greeting> optional = greetingsRepo.findById(1);
            if(optional.isPresent()){
                return optional.get().getMessage();
            }
        }
            return "Hello World!";

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

    public String getMessageById(int id) {
        Optional<Greeting> optional = greetingsRepo.findById(1);
        if(optional.isPresent()){
            return optional.get().getMessage();
        }
        return null;
    }
}
