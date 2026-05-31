package com.home.fuel.DTO;

public class FuelStation {
    private String name;


    FuelStation() {

    }

    FuelStation(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
