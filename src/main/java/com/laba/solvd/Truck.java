package com.laba.solvd;

public class Truck implements IVehicle, ITruckVehicle{
    private String make, model, transmission;
    private int year;
    private double cargoCapacity;

    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setCargoCapacity(double capacity) {
        if (capacity <= 0) throw new IllegalArgumentException("The cargo capacity must be positive.");
        this.cargoCapacity = capacity;
    }

    public double getCargoCapacity() { return cargoCapacity; }

    public void setTransmission(String transmission) {
        if (!transmission.matches("manual | automatic")) {
            throw new IllegalArgumentException("Invalid transmission type.");
        }
        this.transmission = transmission;
    }
    public String getTransmission() { return transmission; }
}
