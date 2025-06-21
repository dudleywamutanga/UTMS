package com.dudley.utms;

class Van implements Serviceable {
    @Override
    public void performMaintenance() {
        System.out.println("Van servicing in progress.");
    }
}
