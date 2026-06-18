package com.home.fuel.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {
    private long id;
    private String firstName;
    private String lastName;
    private String passport;
    private boolean isActive;
}
