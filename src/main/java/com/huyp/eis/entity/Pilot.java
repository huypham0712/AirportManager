package com.huyp.eis.entity;

import java.util.HashSet;

public class Pilot extends FlightCrew {
    private HashSet<PilotLicense> pilotLicenses;

    public HashSet<PilotLicense> getPilotLicenses() {
        return pilotLicenses;
    }

    public void setPilotLicenses(HashSet<PilotLicense> pilotLicenses) {
        this.pilotLicenses = pilotLicenses;
    }
}
