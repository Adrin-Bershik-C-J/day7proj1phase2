package com.day7proj1phase2.helloproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name + "! Welcome to Spring Boot.";
    }

}
