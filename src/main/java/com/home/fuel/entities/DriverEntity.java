package com.home.fuel.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@Data

@Entity
@Table(name = "drivers")
public class DriverEntity {
    @Id()
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "driver_first_name", nullable = false)
    private String firstName;
    @Column(name = "driver_last_name", nullable = false)
    private String lastName;
    @Column(name="passport", nullable = false)
    private String passport;
    @Column(name="date_of_hire", nullable = false)
    private LocalDate dateOfHire;
    @Column(name = "date_of_dismission", nullable = false)
    private LocalDate dateOfDismission;
    @Column(name = "country", nullable = false)
    private String driversCountry;
    @Column(name = "city", nullable = false)
    private String driversCity;
    @Column(name = "address", nullable = false)
    private String driversAddress;
    @Column(name = "zip", nullable = false)
    private String driversZip;
    @Column(name = "phone", nullable = false)
    private String phone;
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    public DriverEntity(String firstName,
                        String lastName,
                        String passport,
                        LocalDate dateOfHire,
                        LocalDate dateOfDismission,
                        String driversCountry,
                        String driversCity,
                        String driversAddress,
                        String driversZip,
                        String phone,
                        Boolean isActive) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.dateOfHire = dateOfHire;
        this.dateOfDismission = dateOfDismission;
        this.driversCountry = driversCountry;
        this.driversCity = driversCity;
        this.driversAddress = driversAddress;
        this.driversZip = driversZip;
        this.phone = phone;
        this.isActive = isActive;
    }
}
