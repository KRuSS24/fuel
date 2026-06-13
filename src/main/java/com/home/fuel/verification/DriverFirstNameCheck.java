package com.home.fuel.verification;

import com.home.fuel.DTO.DriverDto;
import org.springframework.stereotype.Component;

@Component
public class DriverFirstNameCheck {

    Errors firstNameIsEmptyCheck(String firstName) {
        if(firstName == null || firstName.isEmpty()) {
            return new Errors("First name is empty");
        };
        return null;
    }
}
