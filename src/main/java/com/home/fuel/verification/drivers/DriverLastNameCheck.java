package com.home.fuel.verification.drivers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.verification.DriversVerificationInterf;
import com.home.fuel.verification.Errors;
import org.springframework.stereotype.Component;

@Component
public class DriverLastNameCheck implements DriversVerificationInterf {

    @Override
    public Errors driversVerification(DriverDto driverDto) {

        if(driverDto.getLastName() == null || driverDto.getLastName().isEmpty()) {
            return new Errors("Last name is required");
        }
            return null;
    }

    //    Errors lastNameIsEmptyCheck(String lastName) {
//        if(lastName == null || lastName.isEmpty()) {
//            return new Errors("Last name is empty");
//        };
//        return null;
//    }

}
