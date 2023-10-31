package com.example.it_overone_final_project.controllers;

import com.example.it_overone_final_project.models.AdvertModel;
import com.example.it_overone_final_project.repos.AdvertRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/addAdvert")
public class AddAdvertController {
    final
    AdvertRepository advertRepository;
    public AddAdvertController(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    @PostMapping
public String postData(@RequestParam String name,@RequestParam String price,
                       @RequestParam String weight,
                       @RequestParam String disc,
                       @RequestParam String height,
                       @RequestParam String width,
                       @RequestParam String length){
        AdvertModel advertModel = new AdvertModel();
        advertModel.setName(name);
        advertModel.setPrice(price);
        advertModel.setDisc(disc);
        advertModel.setWeight(weight);
        advertModel.setHeight(height);
        advertModel.setWidth(width);
        advertModel.setLength(length);
        advertRepository.save(advertModel);
        return "index";
    }
    @GetMapping
    public String addAdvert(){
    return "addAdvert";
}

}
