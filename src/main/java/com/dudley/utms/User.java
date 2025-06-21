package com.dudley.utms;

// Abstract class defining general template for Users
public abstract class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters (Encapsulation)
    public String getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }

    // Abstract method to be implemented by subclasses
    public abstract void requestTransport();
}
