package br.com.middmoon.spring.helloworld.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public ResponseEntity<?> getHelloMessage() {
        return ResponseEntity.ok("Hello buddies");
    }
}
