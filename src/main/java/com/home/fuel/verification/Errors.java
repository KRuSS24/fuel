package com.home.fuel.verification;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Errors {

    private String errorMessage;


    public Errors(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
