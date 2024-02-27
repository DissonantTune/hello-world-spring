package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GreetServiceTest {

    GreetService greetService;

    @BeforeEach
    void init() {
        greetService = new GreetService();
    }

    @Test
    void greet_ShouldReturnHelloWorld() {

        String result = greetService.greet();

        assertThat(result).isEqualTo("Hello World");

    }

}