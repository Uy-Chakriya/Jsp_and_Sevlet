package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Handle the root URL ("/") and redirect to index.html in /static
    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }
}
