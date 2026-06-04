package com.home.fuel.controllers;



import com.home.fuel.repositories.FuelCardEntityRepo;
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

    @GetMapping("/")
    public String home(){
        return "index";
    }
}
