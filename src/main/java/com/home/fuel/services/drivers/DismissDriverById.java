package com.home.fuel.services.drivers;

import com.home.fuel.entities.DriverEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class DismissDriverById {
    private final DriverEntityRepo driverEntityRepo;


    public DriverEntity dismissDriverById(Long id) {
        Optional<DriverEntity> driver = driverEntityRepo.findById(id);
        if (driver.isPresent()) {
            var driverEntity = driver.get();
            driverEntity.setIsActive(false);
            driverEntity.setDateOfDismission(LocalDate.now());

            return driverEntityRepo.save(driverEntity);
        }
        return driver.get();
    }
}
