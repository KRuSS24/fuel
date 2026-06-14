package com.home.fuel.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

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
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    public DriverEntity(String firstName, String lastName, String passport, boolean b) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
        this.isActive = b;
    }
}
