package com.home.fuel.services;


import com.home.fuel.DTO.Driver;
import com.home.fuel.DTO.FuelCard;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.entities.FuelCardEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import com.home.fuel.repositories.FuelCardEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
@RequiredArgsConstructor
public class DtoService {
    private final FuelCardEntityRepo fuelCardEntityRepo;
    private final DriverEntityRepo driverEntityRepo;

    public List<FuelCard> getFuelCards() {
        List<FuelCardEntity> fuelCardEntities = fuelCardEntityRepo.findAll();
        List<FuelCard> fuelCardList = new ArrayList<>();
        if (!fuelCardEntities.isEmpty()) {
            for (FuelCardEntity element : fuelCardEntities) {

                FuelCard fuelCard = new FuelCard();
                fuelCard.setCardNr(element.getCardNr());
                fuelCard.setPin(element.getPin());
                fuelCard.setExpDate(element.getExpDate());
                fuelCard.setTruckNr(element.getTruckNr());
                fuelCard.setFuelStation(element.getFuelStationEntity().getStationName());

                fuelCardList.add(fuelCard);
            }
        }
        return fuelCardList;
    }

    public List<Driver> getDrivers(){
        List<DriverEntity> driverEntities = driverEntityRepo.findAll();
        List<Driver> drivers=new ArrayList<>();
        if(!driverEntities.isEmpty()){
            for(DriverEntity element: driverEntities){
                Driver driverDto = new Driver();
                driverDto.setFirtstName(element.getFirstName());
                driverDto.setLastName(element.getLastName());
                drivers.add(driverDto);
            }
        }
        return drivers;
    }
}
