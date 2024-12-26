package com.laba.solvd;

public class Motorcycle implements IVehicle, IMotorVehicle{
    private String make, model, type;
    private int year, wheels;

    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setWheels(int wheels) {
        if (wheels < 2) throw new IllegalArgumentException("A motorcycle must have at least 2 wheels.");
        this.wheels = wheels;
    }
    public int getWheels() { return wheels; }

    public void setMotorcycleType(String type) {
        if (!type.matches("sport | cruiser | off-road")) {
            throw new IllegalArgumentException("Invalid motorcycle type.");
        }
        this.type = type;
    }
    public String getMotorcycleType() { return type; }
}
