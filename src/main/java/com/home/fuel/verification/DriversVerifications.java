package com.home.fuel.verification;

import com.home.fuel.DTO.DriverDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Component
public class DriversVerifications {
    private final DriverFirstNameCheck driverFirstNameCheck;
    private final DriverLastNameCheck driverLastNameCheck;

    List<Errors> driversVerification(DriverDto driverDto) {
        List<Errors> driversVerification = new ArrayList<>();
        driversVerification.add(driverFirstNameCheck.firstNameIsEmptyCheck(driverDto.getFirstName()));
        driversVerification.add(driverLastNameCheck.lastNameIsEmptyCheck(driverDto.getLastName()));
        return driversVerification;
    }

}
