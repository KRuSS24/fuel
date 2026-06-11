package com.home.fuel.controllers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.services.DBService;
import com.home.fuel.services.DtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class MainController {
    private final DtoService dtoService;
    private final DBService dbService;

    @GetMapping("/fuel_cards")
    public String getCards(Model model){
        model.addAttribute("fuel_stations", dtoService.getFuelStatoins());
        model.addAttribute("fuel_cards",dtoService.getFuelCards());
        return  "fuel_cards";
    }

    @GetMapping("/drivers_list")
    public String getDrivers(Model model){

        model.addAttribute("drivers",dtoService.getDrivers());
        model.addAttribute("driverDto", new DriverDto());
        return "drivers_list";
    }

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("fuel_cards", dtoService.getFuelCards());
        model.addAttribute("drivers",dtoService.getActiveDrivers());
        model.addAttribute("fuel_stations",dtoService.getFuelStatoins());
        return "index";

    }
    @PostMapping("/add_driver")
    public String addDriver(@ModelAttribute("driverDto") DriverDto driverDto, Model model){
        DriverEntity driverEntity = dbService.driverFind(driverDto);
        if(driverEntity==null){
            // add driver to the DB
        }
            model.addAttribute("drivers",dtoService.getActiveDrivers());
        return "drivers_list";
    }
}
