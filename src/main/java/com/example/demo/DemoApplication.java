package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/reverse")
    public String reverseAString(){
        String string = "Palindrome";
        int length = string.length();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=length;i<=length-1;i--){
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
