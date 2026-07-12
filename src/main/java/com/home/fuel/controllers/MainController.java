package com.home.fuel.controllers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.services.DtoService;
import com.home.fuel.services.drivers.GetListOfDrivers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class MainController {
    private final GetListOfDrivers getListOfDrivers;
    private final DtoService dtoService;


    @GetMapping("/")
    public String home(Model model)
    {
        System.out.println("Procedure HOME was initialised");
        model.addAttribute("fuel_cards", dtoService.getFuelCards());
        model.addAttribute("drivers",getListOfDrivers.getActiveDrivers());
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

        model.addAttribute("drivers",getListOfDrivers.getActiveDrivers());
        model.addAttribute("driverDto", new DriverDto());
        return "drivers_list";
    }


}
