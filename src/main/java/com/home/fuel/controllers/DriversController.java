package com.home.fuel.controllers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.services.drivers.DismissDriverById;
import com.home.fuel.services.drivers.DriverTestAndSave;
import com.home.fuel.services.drivers.DriverDtoById;
import com.home.fuel.services.drivers.GetListOfDrivers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/drivers")
@Controller
public class DriversController {
    private final DriverTestAndSave driverTestAndSave;
    private final DriverDtoById driverDtoById;
    private final GetListOfDrivers getListOfDrivers;
    private final DismissDriverById dismissDriverById;

    @PostMapping("/add_driver")
    public String addDriver(@ModelAttribute("driverDto") DriverDto driverDto, Model model){
        System.out.println("Procedure Add Driver was initialized");

        driverTestAndSave.driverProcessing(driverDto);
        model.addAttribute("drivers", getListOfDrivers.getActiveDrivers());
        model.addAttribute("driverDto",new DriverDto());
        return "drivers_list";
    }

    @GetMapping("/driver_factory")
    public String getDriverFactory(@RequestParam("id") Long id, Model model){
        System.out.println("Procedure Get Driver Factory was initialised");
        model.addAttribute("driverDto", driverDtoById.getDriver(id));
//        model.addAttribute("driver", new DriverDto());
        return  "driver_factory";
    }


    @GetMapping("/driver-dismiss")
    public String deleteDriver(@RequestParam("id") Long id, Model model){
        System.out.println("Procedure Delete Driver was initialised");
        dismissDriverById.dismissDriverById(id);
        model.addAttribute("drivers", getListOfDrivers.getActiveDrivers());
        model.addAttribute("driverDto", new DriverDto());
        return "drivers_list";
    }
}
