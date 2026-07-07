package com.home.fuel.services;

import com.home.fuel.DTO.DriverDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DriverServices {
    private final DriverEntityRepo driverEntityRepo;

    public DriverDto  getDriver(Long id){
        Optional<DriverEntity> driverEntityOptional=driverEntityRepo.findById(id);
        if(driverEntityOptional.isPresent()){
            DriverEntity driverEntity=driverEntityOptional.get();
            return new DriverDto(driverEntity.getId(),
                    driverEntity.getFirstName(),
                    driverEntity.getLastName(),
                    driverEntity.getPassport(),
                    driverEntity.getIsActive());
        }
        return null;
    }
}
