package com.example.it_overone_final_project.controllers;

import com.example.it_overone_final_project.models.AdvertModel;
import com.example.it_overone_final_project.repos.AdvertRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/allAdverts" )
public class AllAdvertsController {
    final
    AdvertRepository advertRepository;

    public AllAdvertsController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }
    @GetMapping
    public String getAdverts(Model model){
        List<AdvertModel> list = new ArrayList<>();
        list = (List<AdvertModel>) advertRepository.findAll();
        model.addAttribute("allAdverts",list);
        return "allAdverts";
    }



}
