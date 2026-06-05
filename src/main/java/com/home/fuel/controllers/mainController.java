package com.home.fuel.controllers;

import com.home.fuel.services.DtoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequiredArgsConstructor
@Controller
@RequestMapping("/")
public class mainController {
    private final DtoService dtoService;

    @GetMapping("/fuel_cards")
    public String getCards(Model model){
        model.addAttribute("fuel_cards",dtoService.getFuelCards());
        return  "fuel_cards";
    }

    @GetMapping("/drivers_list")
    public String getDrivers(Model model){
        model.addAttribute("drivers",dtoService.getDrivers());
        return "drivers_list";
    }

    @GetMapping("/")
    public String home(Model model)
    {
        model.addAttribute("fuel_cards", dtoService.getFuelCards());
        model.addAttribute("drivers",dtoService.getActiveDrivers());
        return "index";

    }
}
