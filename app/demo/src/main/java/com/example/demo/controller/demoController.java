package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class demoController {
    @GetMapping("/login")
public String  login(){
    return " login successfully";
}
@GetMapping("/register")
public String register(){
    return "register successfully";
}
@GetMapping("/")
public String hello(){
    return " welcome Shekhar";
}
@GetMapping("/about")
public String about(){
    return " this is all about ci/cd" ;
}
@GetMapping("/contact")
public String contact(){
    return " contact number :";
}
}
