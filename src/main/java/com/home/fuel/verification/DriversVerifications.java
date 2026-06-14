package com.home.fuel.verification;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.verification.drivers.DriverFirstNameCheck;
import com.home.fuel.verification.drivers.DriverLastNameCheck;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Component
public class DriversVerifications {
    private final List<DriversVerificationInterf> driversVerificationInterfList;

    public List<Errors> driversVerification(DriverDto driverDto) {

        return driversVerificationInterfList.stream()
                .map(element->element.driversVerification(driverDto))
                .filter(Objects::nonNull)
                .toList();

    }

}
