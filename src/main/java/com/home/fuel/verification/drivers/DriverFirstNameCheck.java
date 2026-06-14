package com.home.fuel.verification.drivers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.verification.DriversVerificationInterf;
import com.home.fuel.verification.Errors;
import org.springframework.stereotype.Component;

@Component
public class DriverFirstNameCheck implements DriversVerificationInterf {

    @Override
    public Errors driversVerification(DriverDto driverDto) {

        if(driverDto.getFirstName() == null || driverDto.getFirstName().isEmpty()) {
            return new Errors("First name is required");
        }
        return null;
    }

//    Errors firstNameIsEmptyCheck(String firstName) {
//        if(firstName == null || firstName.isEmpty()) {
//            return new Errors("First name is empty");
//        };
//        return null;
//    }

}
