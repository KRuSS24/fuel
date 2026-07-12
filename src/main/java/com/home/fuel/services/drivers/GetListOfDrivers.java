package com.home.fuel.services.drivers;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class GetListOfDrivers {
    private final DriverEntityRepo driverEntityRepo;

    public List<DriverDto> getDrivers(){
        List<DriverEntity> driverEntities = driverEntityRepo.findAllOrderByLastName();
        if(!driverEntities.isEmpty()){
            return getDriversDto(driverEntities);
        }
        return null;
    }

    public List<DriverDto> getActiveDrivers(){
        List<DriverEntity> driverEntities = driverEntityRepo.findAllWhereIsActive();
        if(!driverEntities.isEmpty()){
            return getDriversDto(driverEntities);
        }
        return null;
    }

    private List<DriverDto> getDriversDto(List<DriverEntity> driverEntities){
        return driverEntities.stream().
                map(
                        element-> new DriverDto(
                                element.getId(),
                                element.getFirstName(),
                                element.getLastName(),
                                element.getPassport(),
                                element.getDateOfHire(),
                                element.getDateOfDismission(),
                                element.getDriversCountry(),
                                element.getDriversCity(),
                                element.getDriversAddress(),
                                element.getDriversZip(),
                                element.getPhone(),
                                element.getIsActive()))
                .toList();
    }
}
