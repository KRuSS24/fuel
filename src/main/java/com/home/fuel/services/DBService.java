package com.home.fuel.services;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import com.home.fuel.verification.DriversVerifications;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionUsageException;

@RequiredArgsConstructor
@Component
public class DBService {

private final DriverEntityRepo driverEntityRepo;
private final DriversVerifications driversVerifications;

    public void driverProcessing(DriverDto driverDto) {
        if(driversVerifications.driversVerification(driverDto).isEmpty()){
            if(driverFind(driverDto)==null){
                DriverEntity driverEntity = new DriverEntity(driverDto.getFirstName(),
                        driverDto.getLastName(),
                        driverDto.getPassport(),
                true);
                driverEntity=driverEntityRepo
                        .save(driverEntity);
                System.out.println(driverEntity.getId());
            }
        }
    }

    private DriverEntity driverFind(DriverDto driverDto){

        return driverEntityRepo.findByFirstNameAndLastNameAndPassport(
                driverDto.getFirstName(), driverDto.getLastName(), driverDto.getPassport());
    }
}
