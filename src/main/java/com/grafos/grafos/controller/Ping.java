package com.grafos.grafos.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Ping
 */
@RestController
public class Ping {

    @GetMapping("/ping")
    public String pingPong() {
        return "pong";
    }

}