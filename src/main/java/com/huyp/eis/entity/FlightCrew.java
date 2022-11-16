package com.huyp.eis.entity;

import java.util.HashSet;

public class FlightCrew {
    private String fName;
    private String lName;
    private HashSet<PilotLicense> pilotLicenses;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public HashSet<PilotLicense> getPilotLicenses() {
        return pilotLicenses;
    }

    public void setPilotLicenses(HashSet<PilotLicense> pilotLicenses) {
        this.pilotLicenses = pilotLicenses;
    }
}
