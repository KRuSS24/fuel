package com.home.fuel.controllers;

import com.home.fuel.DTO.CardLogBook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class mainController {

//    @GetMapping
    @PostMapping
    public void post(CardLogBook logBook){

    }
}
