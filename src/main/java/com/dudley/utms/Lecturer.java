package com.dudley.utms;

class Lecturer extends User {
    private String department;

    public Lecturer(String id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " requests for transport for " + department + " trip");
    }
}
