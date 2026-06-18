package com.home.fuel.controllers;

import com.home.fuel.DTO.DriverDto;
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

    @GetMapping("/")
    public String home(Model model)
    {
        System.out.println("Procedure HOME was initialised");
        model.addAttribute("fuel_cards", dtoService.getFuelCards());
        model.addAttribute("drivers",dtoService.getActiveDrivers());
        model.addAttribute("fuel_stations",dtoService.getFuelStatoins());
        return "index";

    }

    @GetMapping("/fuel_cards")
    public String getCards(Model model){
        model.addAttribute("fuel_stations", dtoService.getFuelStatoins());
        model.addAttribute("fuel_cards",dtoService.getFuelCards());
        return  "fuel_cards";
    }

    @GetMapping("/drivers_list")
    public String getDrivers(Model model){
        System.out.println("Procedure Get Drivers was initialised");

        model.addAttribute("drivers",dtoService.getDrivers());
        model.addAttribute("driverDto", new DriverDto());
        return "drivers_list";
    }

    @PostMapping("/add_driver")
    public String addDriver(@ModelAttribute("driverDto") DriverDto driverDto, Model model){
        System.out.println("Procedure Add Driver was initialized");

        dbService.driverProcessing(driverDto);
        model.addAttribute("drivers",dtoService.getActiveDrivers());
        model.addAttribute("driverDto",new DriverDto());
        return "drivers_list";
    }
}
