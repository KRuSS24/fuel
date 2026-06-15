package com.home.fuel.services;


import com.home.fuel.DTO.DriverDto;
import com.home.fuel.DTO.FuelCardDto;
import com.home.fuel.DTO.FuelStationDto;
import com.home.fuel.entities.DriverEntity;
import com.home.fuel.entities.FuelCardEntity;
import com.home.fuel.entities.FuelStationEntity;
import com.home.fuel.repositories.DriverEntityRepo;
import com.home.fuel.repositories.FuelCardEntityRepo;
import com.home.fuel.repositories.FuelStationEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
@RequiredArgsConstructor
public class DtoService {
    private final FuelCardEntityRepo fuelCardEntityRepo;
    private final DriverEntityRepo driverEntityRepo;
    private final FuelStationEntityRepo fuelStationEntityRepo;

    public List<FuelCardDto> getFuelCards() {
        List<FuelCardEntity> fuelCardEntities = fuelCardEntityRepo.findAll();
        List<FuelCardDto> fuelCardDtoList = new ArrayList<>();
        if (!fuelCardEntities.isEmpty()) {
            for (FuelCardEntity element : fuelCardEntities) {

                FuelCardDto fuelCardDto = new FuelCardDto();
                fuelCardDto.setCardNr(element.getCardNr());
                fuelCardDto.setPin(element.getPin());
                fuelCardDto.setExpDate(element.getExpDate());
                fuelCardDto.setTruckNr(element.getTruckNr());
                fuelCardDto.setFuelStation(element.getFuelStationEntity().getStationName());

                fuelCardDtoList.add(fuelCardDto);
            }
        }
        return fuelCardDtoList;
    }

    public List<DriverDto> getDrivers(){
        List<DriverEntity> driverEntities = driverEntityRepo.findAllOrderByLastName();
        List<DriverDto> driverDtos =new ArrayList<>();
        if(!driverEntities.isEmpty()){
            for(DriverEntity element: driverEntities){
                DriverDto driverDto = new DriverDto();
                driverDto.setFirstName(element.getFirstName());
                driverDto.setLastName(element.getLastName());
                driverDtos.add(driverDto);
            }
        }
        return driverDtos;
    }

    public List<DriverDto> getActiveDrivers(){
        List<DriverEntity> driverEntities = driverEntityRepo.findAllWhereIsActive();
        if(!driverEntities.isEmpty()){
            return driverEntities.stream().
                    map(
                            element-> new DriverDto(element.getFirstName(),
                                    element.getLastName(),
                                    element.getPassport(),
                                    element.getIsActive()))
                    .toList();
        }
        return null;
    }

    public List<FuelStationDto> getFuelStatoins(){
        List<FuelStationEntity> fuelStationEntities = fuelStationEntityRepo.findAll();
        if(!fuelStationEntities.isEmpty()){
            return fuelStationEntities.stream()
                .map(element->new FuelStationDto(element.getStationName())).toList();

        }
        return null;
    }
}
