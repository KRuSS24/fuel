package com.home.fuel.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private long id;
    private String firstName;
    private String lastName;
    private String passport;
    private LocalDate dateOfHire;
    private LocalDate dateOfDismission;
    private String driversCountry;
    private String driversCity;
    private String driversAddress;
    private String driversZip;
    private String driversPhone;
    private boolean isActive;
}
