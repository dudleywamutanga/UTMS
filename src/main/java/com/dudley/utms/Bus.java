package com.dudley.utms;

class Bus implements Serviceable, Trackable {
    @Override
    public void performMaintenance() {
        System.out.println("Bus undergoing maintenance.");
    }

    @Override
    public String getLocation() {
        return "Bus at Main Campus Terminal.";
    }
}
