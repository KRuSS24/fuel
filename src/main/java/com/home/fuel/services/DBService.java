package com.home.fuel.services;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DBService {

private final DriverEntityRepo driverEntityRepo;

    public DriverEntity driverFind(DriverDto driverDto){

        return driverEntityRepo.findByFirstNameAndLastNameAndPassport(
                driverDto.getFirstName(), driverDto.getLastName(), driverDto.getPassport());
    }
}
