package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping
    public String getWelcomeMessage() {
        return "Hey there! Welcome to this demo application.";
    }

    @GetMapping("/greetingWithName")
    public String getMessageWithName(@RequestParam(value="name", defaultValue = "there") String name) {
        return String.format("Hey %s! Welcome to this demo application.", name);
    }
}
