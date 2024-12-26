package com.laba.solvd;

import java.util.Scanner;

// Admin class responsible for creating vehicle instances from user input
public class Admin {
    // Method to create a car from user input
    public static Car createCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        int year = scanner.nextInt();
        Car car = new Car(make, model, year);

        // Prompt user for additional car details
        System.out.print("Enter number of doors: ");
        car.setDoors(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter fuel type (gasoline/diesel/electric): ");
        car.setFuelType(scanner.nextLine());

        return car;
    }

    // Method to create a truck from user input with error handling for transmission
    public Truck createTruck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter truck make:");
        String make = scanner.nextLine();
        System.out.println("Enter truck model:");
        String model = scanner.nextLine();
        System.out.println("Enter truck year:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter cargo capacity:");
        double capacity = scanner.nextDouble();
        scanner.nextLine();

        Truck truck = new Truck(make, model, year);
        truck.setCargoCapacity(capacity);

        // Prompt user for transmission with retry mechanism
        while (true) {
            try {
                System.out.println("Enter transmission type (manual or automatic):");
                String transmission = scanner.nextLine();
                truck.setTransmission(transmission);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Please try again.");
            }
        }

        return truck;
    }

    // Method to create a motorcycle from user input
    public Motorcycle createMotorcycle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter motorcycle make:");
        String make = scanner.nextLine();
        System.out.println("Enter motorcycle model:");
        String model = scanner.nextLine();
        System.out.println("Enter motorcycle year:");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter number of wheels:");
        int wheels = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter motorcycle type:");
        String type = scanner.nextLine();
        Motorcycle motorcycle = new Motorcycle(make, model, year);
        motorcycle.setWheels(wheels);
        motorcycle.setMotorcycleType(type);
        return motorcycle;
    }
}
