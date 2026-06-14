package com.home.fuel.verification;


import com.home.fuel.DTO.DriverDto;

@FunctionalInterface
public interface DriversVerificationInterf {
    Errors driversVerification(DriverDto driverDto);
}
