package com.example.spring_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MyController {
    @GetMapping("/foo")
    public String index() {
        return "bar";
    }
}