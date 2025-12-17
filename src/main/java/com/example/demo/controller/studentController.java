package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping("/students")
    public List<String> getStudents() {
        return List.of("Alice", "Bob", "Charlie");
    }

    @GetMapping("/test")
    public String test() {
        return "Hello";
    }
}
