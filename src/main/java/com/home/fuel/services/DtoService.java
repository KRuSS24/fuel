package com.home.fuel.services;


import com.home.fuel.DTO.FuelCard;
import com.home.fuel.entities.FuelCardEntity;
import com.home.fuel.repositories.FuelCardEntityRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component()
@RequiredArgsConstructor
public class DtoService {
    private final FuelCardEntityRepo fuelCardEntityRepo;

    public List<FuelCard> getFuelCards() {
        List<FuelCardEntity> fuelCardEntities = fuelCardEntityRepo.findAll();
        List<FuelCard> fuelCardList = new ArrayList<>();
        FuelCard fuelCard = new FuelCard();
        if (!fuelCardEntities.isEmpty()) {
            for (FuelCardEntity element : fuelCardEntities) {
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
}
