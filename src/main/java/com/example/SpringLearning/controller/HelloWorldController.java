package com.example.SpringLearning.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/SpringLearning")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloPage(Model model) {
        return "Hello from BridgeLabz";
    }
}