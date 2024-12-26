package com.laba.solvd;

// Car class implements IVehicle and ICarVehicle interfaces
public class Car implements IVehicle, ICarVehicle {
    // Instance variables for car attributes
    private String make, model, fuelType;
    private int year, doors;

    // Constructor to initialize the make, model, and year of the car
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods to retrieve the car's attributes
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    // Setter method for doors with validation
    public void setDoors(int doors) {
        if (doors < 1) throw new IllegalArgumentException("The number of doors must be greater than 0.");
        this.doors = doors;
    }

    // Getter method for doors
    public int getDoors() { return doors; }

    // Setter method for fuelType with validation
    public void setFuelType(String fuelType) {
        if (!fuelType.matches("gasoline | diesel | electricity")) {
            throw new IllegalArgumentException("Invalid fuel type.");
        }
        this.fuelType = fuelType;
    }

    // Getter method for fuelType
    public String getFuelType() { return fuelType; }
}
