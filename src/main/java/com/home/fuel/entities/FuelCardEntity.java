package com.home.fuel.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name="fuel_cards")
@Getter
@Setter
public class FuelCardEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "card_nr", nullable = false)
    private String cardNr;
    @Column(name = "pin", nullable = false)
    private String pin;
    @Column(name = "exp_date")
    private LocalDate expDate;
    @Column(name = "truck_nr")
    private String truckNr;
    @OneToOne
    @JoinColumn(name = "petrol_station_ref")
    private FuelStationEntity fuelStationEntity;
}
