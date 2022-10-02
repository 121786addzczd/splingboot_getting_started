package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
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
    public String create(@Validated @ModelAttribute Person person, BindingResult result){
        if (result.hasErrors()) {
            return "person/index";
        }
        return "person/create";
    }
}