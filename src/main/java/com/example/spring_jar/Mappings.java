package com.example.spring_jar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mappings {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}