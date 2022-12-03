package com.huyp.eis.entity;

import java.util.HashSet;

public class FlightCrew {
    private String firstName;
    private String lastName;
    private HashSet<PilotLicense> pilotLicenses;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public HashSet<PilotLicense> getPilotLicenses() {
        return pilotLicenses;
    }

    public void setPilotLicenses(HashSet<PilotLicense> pilotLicenses) {
        this.pilotLicenses = pilotLicenses;
    }
}
