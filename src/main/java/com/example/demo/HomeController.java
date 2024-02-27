package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/greet")
public class HomeController {

    private final GreetService greetService;

    @GetMapping()
    String greet() {
        return greetService.greet();
    }
}
