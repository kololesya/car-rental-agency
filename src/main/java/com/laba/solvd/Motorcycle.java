package com.laba.solvd;

// Motorcycle class implements IVehicle and IMotorVehicle interfaces
public class Motorcycle implements IVehicle, IMotorcycleVehicle {
    // Instance variables for motorcycle attributes
    private String make, model, type;
    private int year, wheels;

    // Constructor to initialize the make, model, and year of the motorcycle
    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods to retrieve the motorcycle's attributes
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    // Setter method for wheels with validation
    public void setWheels(int wheels) {
        if (wheels < 2) throw new IllegalArgumentException("A motorcycle must have at least 2 wheels.");
        this.wheels = wheels;
    }

    // Getter method for wheels
    public int getWheels() { return wheels; }

    // Setter method for motorcycle type with validation
    public void setMotorcycleType(String type) {
        if (!type.matches("sport | cruiser | off-road")) {
            throw new IllegalArgumentException("Invalid motorcycle type.");
        }
        this.type = type;
    }

    // Getter method for motorcycle type
    public String getMotorcycleType() { return type; }
}
