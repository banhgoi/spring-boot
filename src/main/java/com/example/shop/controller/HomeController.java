package com.example.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class HomeController {
    @GetMapping(value = {"/","/home"})
    public String index() {
        return "home/index";
    }

    @GetMapping("/hello")
    public String helle(){
        return "hello";
    }
}
