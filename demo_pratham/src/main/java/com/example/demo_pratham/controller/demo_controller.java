package com.example.demo_pratham.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class demo_controller {
    @GetMapping("/")
    public String welcomeMessage(){

        return "Welcomeeeeeeeee";
    }

    @GetMapping("/date")
    public Date getDate(){

        return new Date();
    }
}


