package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/hello")
    public Hello hello(@RequestParam(value = "name", defaultValue = "Shark") String name){
        return new Hello(counter.incrementAndGet(), String.format(template, name));}
}

