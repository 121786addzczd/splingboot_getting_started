package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.models.Person;

@Controller
public class PersonController {
    
    @GetMapping("/")
    public String index(@ModelAttribute Person person){
        return "person/index";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Person person){
        return "person/create";
    }
}