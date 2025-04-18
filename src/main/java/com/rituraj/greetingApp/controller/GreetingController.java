package com.rituraj.greetingApp.controller;
import com.rituraj.greetingApp.model.Greeting;
import com.rituraj.greetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greetings")
public class GreetingController {
    private GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping("/id")
    public String getMessageById(@RequestParam int id){
        return greetingService.getMessageById(id);
    }

    @GetMapping("/data")
    public List<Greeting> getAllMessages(){
        return greetingService.getAllMessages();
    }

    @GetMapping
    public String greet(@RequestParam(value = "firstname", required = false) String firstName,
                        @RequestParam(value = "lastname", required = false) String lastName) {
        return greetingService.getGreeting(firstName, lastName);

    }

    @PostMapping
    public String createGreeting() {
        return greetingService.createGreeting();
    }

    @PutMapping
    public void updateGreeting(@RequestParam(value = "id") int id,
                                 @RequestParam(value = "msg") String msg) {
        greetingService.updateGreeting(id, msg);
    }

    @DeleteMapping
    public void deleteGreeting(@RequestParam int id) {
        greetingService.deleteGreeting(id);
    }
}
