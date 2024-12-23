package com.laba.solvd;

public class Car implements IVehicle, ICarVehicle{
    private String make, model, fuelType;
    private int year, doors;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }

    public void setDoors(int doors) {
        if (doors < 1) throw new IllegalArgumentException("Количество дверей должно быть больше 0.");
        this.doors = doors;
    }
    public int getDoors() { return doors; }

    public void setFuelType(String fuelType) {
        if (!fuelType.matches("бензин|дизель|электричество")) {
            throw new IllegalArgumentException("Недопустимый тип топлива.");
        }
        this.fuelType = fuelType;
    }
    public String getFuelType() { return fuelType; }
}
