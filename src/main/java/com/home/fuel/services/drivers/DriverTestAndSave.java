package com.home.fuel.services.drivers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import com.home.fuel.verification.DriversVerifications;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class DriverTestAndSave {

private final DriverEntityRepo driverEntityRepo;
private final DriversVerifications driversVerifications;

    public void driverProcessing(DriverDto driverDto) {
        if(driversVerifications.driversVerification(driverDto).isEmpty()){
            if(driverFind(driverDto)==null){
                DriverEntity driverEntity = new DriverEntity(
                        driverDto.getFirstName(),
                        driverDto.getLastName(),
                        driverDto.getPassport(),
                        driverDto.getDateOfHire(),
                        driverDto.getDateOfDismission(),
                        driverDto.getDriversCountry(),
                        driverDto.getDriversCity(),
                        driverDto.getDriversAddress(),
                        driverDto.getDriversZip(),
                        driverDto.getDriversPhone(),
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
