package com.javapoint.habits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/client")
    public String showClient() {
        return "client";
    }
}

