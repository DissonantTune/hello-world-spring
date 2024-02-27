package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GreetService {
    public String greet() {
        return "Hello World";
    }
}
