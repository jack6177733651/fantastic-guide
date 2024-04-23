package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JackController {

    @GetMapping("/jack")
    public String sayJack() {
        return "jack changed";
    }
}
