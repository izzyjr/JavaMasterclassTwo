package com.israelmesa;

public class PC {

    private Case theCase;
    private Monitor monitors;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitors, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitors = monitors;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitors() {
        return monitors;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
