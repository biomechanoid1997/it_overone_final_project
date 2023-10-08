package com.example.it_overone_final_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutUsController {
    @GetMapping
    public String getAboutUsInfo(){
        return "aboutUs";
    }
}
