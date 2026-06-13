package com.home.fuel.verification;

import org.springframework.stereotype.Component;

@Component
public class DriverLastNameCheck {

    Errors lastNameIsEmptyCheck(String lastName) {
        if(lastName == null || lastName.isEmpty()) {
            return new Errors("Last name is empty");
        };
        return null;
    }
}
