package com.zup.nossobancodigital.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HelloWorldController {


    @GetMapping
    public ResponseEntity<String> home() {
        return ResponseEntity.ok("Hello World Rafael");
    }
}
