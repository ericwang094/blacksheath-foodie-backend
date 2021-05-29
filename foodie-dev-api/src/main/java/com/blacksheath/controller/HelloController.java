package com.blacksheath.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Object hello() {
        return "Hello World";
    }

    @GetMapping("/error")
    public Object error() {
        return "error";
    }
}
