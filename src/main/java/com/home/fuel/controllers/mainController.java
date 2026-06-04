package com.home.fuel.controllers;


import com.home.fuel.entities.FuelCardEntity;
import com.home.fuel.repositories.FuelCardEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class mainController {

    private final FuelCardEntityRepo fuelCardEntityRepo;
    @GetMapping()
    @RequestMapping("/fuel_card")
    public List<FuelCardEntity> getCards(){

        return  fuelCardEntityRepo.findAll();//fuelcCardList;
    }
}
