package com.home.fuel.verification.drivers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.verification.DriversVerificationInterf;
import com.home.fuel.verification.Errors;
import org.springframework.stereotype.Component;

@Component
public class DriverPassportCheck implements DriversVerificationInterf {

    @Override
    public Errors driversVerification(DriverDto driverDto) {

        if(driverDto.getPassport() == null || driverDto.getPassport().isEmpty()) {
            return new Errors("Passport is required");
        }
        return null;
    }

}
