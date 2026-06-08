package com.home.fuel.DTO;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FuelStation {
    private String name;


    public FuelStation() {
    }

    public FuelStation(String name){
        this.name=name;
    }

}
