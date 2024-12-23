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
        if (wheels < 2) throw new IllegalArgumentException("Мотоцикл должен иметь как минимум 2 колеса.");
        this.wheels = wheels;
    }
    public int getWheels() { return wheels; }

    public void setMotorcycleType(String type) {
        if (!type.matches("спорт|круизер|внедорожник")) {
            throw new IllegalArgumentException("Недопустимый тип мотоцикла.");
        }
        this.type = type;
    }
    public String getMotorcycleType() { return type; }
}
