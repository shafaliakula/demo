package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Resource;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MyRestController {
    
        private static final String template="Hello! %s";
        private final AtomicLong counter = new AtomicLong();


    @GetMapping("/restController")
        public Resource getResource(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Resource(counter.incrementAndGet(),
                String.format(template, name));
        }

    }

