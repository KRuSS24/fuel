package com.home.fuel.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "driver")
public class DriverEntity {
    @Id()
    @Column(name = "id", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "driver_first_name", nullable = false)
    private String firstName;
    @Column(name = "driver_last_name", nullable = false)
    private String lastName;
}
