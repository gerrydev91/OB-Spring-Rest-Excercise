package com.gerryph.obspringexcercise.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(){

        return "This is proof that the Rest controller on Hello, works. ";

    }

    
}
