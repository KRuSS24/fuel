package com.home.fuel.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="fuel_cards")
public class FuelCardEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "card_nr", nullable = false)
    private String name;
    @Column(name = "pin", nullable = false)
    private String pin;
    @Column(name = "exp_date")
    private LocalDate expDate;
    @Column(name = "truck_nr")
    private String truckNr;
//    @Column(name = "petrol_station_ref")
    @ManyToOne()
    @JoinColumn(name = "petrol_station_ref")
    private FuelStationEntity fuelStationEntity;
}
