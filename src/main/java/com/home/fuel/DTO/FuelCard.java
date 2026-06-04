package com.home.fuel.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class FuelCard {
    private String cardNr;
    private String pin;
    private LocalDate expDate;
    private String truckNr;
    private String fuelStation;
}