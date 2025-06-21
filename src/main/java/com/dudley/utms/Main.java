package com.dudley.utms;

public class Main {
    public static void main(String[] args) {

        // Inheritance and Polymorphism (Method Overriding)
        Student student = new Student("Stud4", "Mathias", "matt@gmail.com", "Computer Science");
        User lecturer = new Lecturer("Lec12", "Shamirah", "shamie@gmail.com", "FST");

        student.requestTransport();
        lecturer.requestTransport();

        // Encapsulation
        Driver driver = new Driver();

        driver.setName("Dudley");
        driver.setVehicleName("Benz");
        driver.setLicenseNumber("UAG 2449 M");
        System.out.println("Driver License: " + driver.getLicenseNumber());

        // Try invalid license
        driver.setLicenseNumber("123");

        // Interfaces
        Serviceable bus = new Bus();
        bus.performMaintenance();

        Trackable trackableBus = new Bus();
        System.out.println("Bus location: " + trackableBus.getLocation());

        // Polymorphism (Method Overloading)
        TransportOfficer officer = new TransportOfficer("TO01", "Justine", "justin@gmail.com");
        officer.assignDriver(4);
        officer.assignDriver("Morning");
    }
}
