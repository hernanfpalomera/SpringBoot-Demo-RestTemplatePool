package com.brainstorm.SpringBootDemoRestTemplatePool.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hello-world")
    public String HelloWorld(){
        return "Hello World";
    }
}
