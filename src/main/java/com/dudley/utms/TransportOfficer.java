package com.dudley.utms;

class TransportOfficer extends User {
    public TransportOfficer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " schedules a vehicle.");
    }

    // Method Overloading
    public void assignDriver(int busNo) {
        System.out.println("Driver assigned to bus number " + busNo);
    }

    public void assignDriver(String shiftTime) {
        System.out.println("Driver assigned to " + shiftTime + " shift.");
    }
}
