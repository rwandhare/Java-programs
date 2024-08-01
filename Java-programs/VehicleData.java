/*3. Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and  Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed*/


abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public String getFuelType() { return fuelType; }

    public abstract double calculateFuelEfficiency(); // in km/l or mpg
    public abstract double calculateDistanceTraveled(double fuel); // distance in km or miles
    public abstract double getMaxSpeed(); // speed in km/h or mph

    @Override
    public String toString() {
        return year + " " + make + " " + model + " (" + fuelType + ")";
    }
}

class Car extends Vehicle {
    private double fuelEfficiency; // in km/l
    private double maxSpeed; // in km/h

    public Car(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public double calculateDistanceTraveled(double fuel) {
        return fuel * fuelEfficiency;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

class Truck extends Vehicle {
    private double fuelEfficiency; // in km/l
    private double maxSpeed; // in km/h

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public double calculateDistanceTraveled(double fuel) {
        return fuel * fuelEfficiency;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

class Motorcycle extends Vehicle {
    private double fuelEfficiency; // in km/l
    private double maxSpeed; // in km/h

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency, double maxSpeed) {
        super(make, model, year, fuelType);
        this.fuelEfficiency = fuelEfficiency;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return fuelEfficiency;
    }

    @Override
    public double calculateDistanceTraveled(double fuel) {
        return fuel * fuelEfficiency;
    }

    @Override
    public double getMaxSpeed() {
        return maxSpeed;
    }
}

public class VehicleData {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Corolla", 2020, "Petrol", 15.0, 180.0);
        Vehicle truck = new Truck("Ford", "F-150", 2019, "Diesel", 8.0, 120.0);
        Vehicle motorcycle = new Motorcycle("Yamaha", "YZF-R3", 2021, "Petrol", 25.0, 160.0);

        System.out.println(car);
        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled on 10 liters: " + car.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h");

        System.out.println();

        System.out.println(truck);
        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled on 10 liters: " + truck.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h");

        System.out.println();

        System.out.println(motorcycle);
        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " km/l");
        System.out.println("Distance Traveled on 10 liters: " + motorcycle.calculateDistanceTraveled(10) + " km");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " km/h");
    }
}


/*
 	OUTPUT
2020 Toyota Corolla (Petrol)
Fuel Efficiency: 15.0 km/l
Distance Traveled on 10 liters: 150.0 km
Max Speed: 180.0 km/h

2019 Ford F-150 (Diesel)
Fuel Efficiency: 8.0 km/l
Distance Traveled on 10 liters: 80.0 km
Max Speed: 120.0 km/h

2021 Yamaha YZF-R3 (Petrol)
Fuel Efficiency: 25.0 km/l
Distance Traveled on 10 liters: 250.0 km
Max Speed: 160.0 km/h

*/
