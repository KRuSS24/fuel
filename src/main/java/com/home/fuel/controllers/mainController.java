package com.home.fuel.controllers;

import com.home.fuel.DTO.CardLogBook;
import com.home.fuel.entities.FuelCardEntity;
import com.home.fuel.repositories.FuelCardEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class mainController {

    private final FuelCardEntityRepo fuelCardEntityRepo;
    @GetMapping()
    @RequestMapping("/fuel_card")
//    @ResponseBody()
//    @PostMapping
    public List<FuelCardEntity> getCards(){
//        List<FuelCardEntity> fuelcCardList = fuelCardEntityRepo.findAll();// new ArrayList<>();
//        List<FuelCardEntity> optFuelCardList = fuelCardEntityRepo.findAll();

        return  fuelCardEntityRepo.findAll();//fuelcCardList;
    }
}
