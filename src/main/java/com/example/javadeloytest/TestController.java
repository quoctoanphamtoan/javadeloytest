package com.example.javadeloytest;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping("/test")
    public String ste(){
        return "test Nef Nha";
    }
}
