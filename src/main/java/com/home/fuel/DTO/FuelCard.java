package com.home.fuel.DTO;

import java.time.LocalDate;

public class FuelCard {
    private String cardNr;
    private String pin;
    private LocalDate expDate;

    public FuelCard(String cardNr, String pin, LocalDate expDate) {
        this.cardNr = cardNr;
        this.pin = pin;
        this.expDate = expDate;
    }

    public FuelCard() {
    }

    public String getCardNr() {
        return cardNr;
    }

    public void setCardNr(String cardNr) {
        this.cardNr = cardNr;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
