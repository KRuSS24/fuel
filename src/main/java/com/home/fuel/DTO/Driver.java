package com.home.fuel.DTO;

public class Driver {
    private String firtstName;
    private String lastName;

    public Driver(String firtstName, String lastName) {
        this.firtstName = firtstName;
        this.lastName = lastName;
    }

    public Driver() {
    }

    public String getFirtstName() {
        return firtstName;
    }

    public void setFirtstName(String firtstName) {
        this.firtstName = firtstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
