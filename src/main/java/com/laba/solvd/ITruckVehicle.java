// Package declaration
package com.laba.solvd;

// ITruckVehicle interface defines methods specific to trucks
public interface ITruckVehicle {
    void setCargoCapacity(double capacity);
    double getCargoCapacity();
    void setTransmission(String transmission);
    String getTransmission();
}
