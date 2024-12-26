package com.laba.solvd;

// Truck class implements IVehicle and ITruckVehicle interfaces
public class Truck implements IVehicle, ITruckVehicle {
    // Instance variables for truck attributes
    private String make, model, transmission;
    private int year;
    private double cargoCapacity;

    // Constructor to initialize the make, model, and year of the truck
    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods to retrieve the truck's attributes
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    // Setter method for cargo capacity with validation
    public void setCargoCapacity(double capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("The cargo capacity must be positive.");
        this.cargoCapacity = capacity;
    }

    // Getter method for cargo capacity
    public double getCargoCapacity() { return cargoCapacity; }

    // Setter method for transmission with validation and trimming input
    public void setTransmission(String transmission) {
        System.out.println("Transmission received: [" + transmission + "]");

        transmission = transmission.trim();  // Remove any leading/trailing spaces
        if (transmission.equalsIgnoreCase("manual") || transmission.equalsIgnoreCase("automatic")) {
            this.transmission = transmission;
        } else {
            throw new IllegalArgumentException("Invalid transmission type.");
        }
    }

    // Getter method for transmission
    public String getTransmission() { return transmission; }
}
