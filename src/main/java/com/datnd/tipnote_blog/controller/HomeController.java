package com.datnd.tipnote_blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // Tìm index.html trong templates/
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello"; // Tìm hello.html trong templates/
    }
}
