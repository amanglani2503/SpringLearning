package com.example.SpringLearning.controller;

import com.example.SpringLearning.model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/SpringLearning/web")
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("message", new HelloWorld("Hello from BridgeLabz"));
        return "Hello";
    }
}