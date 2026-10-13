package com.sk.skala.myapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloController {
    
    @GetMapping("/hello")
    public HelloResponse helloWorld() {
        return new HelloResponse("sk178 수정 배포");
    }
}

record HelloResponse(String message) {} 
