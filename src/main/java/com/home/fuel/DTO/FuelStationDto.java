package com.home.fuel.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuelStationDto {
    private String name;


    public FuelStationDto() {
    }

    public FuelStationDto(String name){
        this.name=name;
    }

}
