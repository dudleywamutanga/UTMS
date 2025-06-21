package com.dudley.utms;

class Driver {
    private String licenseNumber;
    private String name;
    private String vehicleName;

    // Getter and Setter with validation

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber.length() >= 5) {
            this.licenseNumber = licenseNumber;
        } else {
            System.out.println("License number must be more than 5 characters");
        }
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }
}
