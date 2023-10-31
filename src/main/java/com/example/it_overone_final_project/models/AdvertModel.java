package com.example.it_overone_final_project.models;

import lombok.Data;

import jakarta.persistence.*;

@Entity
@Table(name = "advert.shop.model")
@Data
public class AdvertModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @Column(name = "name")
    String name;

    @Column(name = "price")
    String price;

    @Column(name = "weight")
    String weight;

    @Column(name = "disc")
    String disc;

    @Column(name = "height")
    String height;

    @Column(name = "width")
    String width;

    @Column(name = "length")
    String length;
}
