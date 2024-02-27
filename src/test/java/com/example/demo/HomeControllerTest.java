package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HomeController.class)
class HomeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    GreetService mockGreetService;


    @Test
    void greet_givenValidRequestShouldReturn200() throws Exception {

        when(mockGreetService.greet()).thenReturn("Hello World");

        mockMvc.perform(get("/greet"))
                .andExpect(content().string(containsString("Hello World")))
                .andExpect(status().isOk());

        verify(mockGreetService).greet();
    }

}