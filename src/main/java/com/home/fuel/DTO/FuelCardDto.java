package com.home.fuel.DTO;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Setter
@Getter
public class FuelCardDto {
    private String cardNr;
    private String pin;
    private LocalDate expDate;
    private String truckNr;
    private String fuelStation;
}