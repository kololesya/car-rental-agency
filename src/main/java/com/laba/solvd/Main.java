package com.laba.solvd;

// Main class to test vehicle creation
public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        // Create a truck using Admin's createTruck method
        Truck truck = admin.createTruck();

        // Display truck details
        System.out.println("Truck Details:");
        System.out.println("Make: " + truck.getMake());
        System.out.println("Model: " + truck.getModel());
        System.out.println("Year: " + truck.getYear());
        System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
        System.out.println("Transmission: " + truck.getTransmission());
    }
}
