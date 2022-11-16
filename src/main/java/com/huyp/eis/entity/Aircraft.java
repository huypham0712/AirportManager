package com.huyp.eis.entity;

import java.util.HashSet;

public class Aircraft {
    private String brand;
    private String airline;
    private String flightNumber;

    private HashSet<FlightCrew> flightCrews;
    private Integer passengerCapacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
}
