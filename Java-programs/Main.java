/* Write a Java program to create a class called Vehicle with a method called drive(). ● Vehicle should have attributes such as make (String), model (String) , year (int) and maximumSpeed (int). ● Create a constructor in Vehicle with all fields as constructor parameters. ● Create a subclass called Car and override constructor. Call super(). ● Write a function that overrides the drive() method to print (make + “ ” + model + " Car is driving". ) ● Also create another subclass Bike extending the vehicle class. ● Override the drive() method to print (make + “ ” + model + " Bike is driving". ) ● Instantiate both Bike and Car class. Print their attributes*/

// Vehicle.java
class Vehicle {
    char[] make;
    char[] model;
    int year;
    int maximumSpeed;

    public Vehicle(char[] make, char[] model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

// Car.java
class Car extends Vehicle {

    public Car(char[] make, char[] model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.print(make);
        System.out.print(" ");
        System.out.print(model);
        System.out.println(" Car is driving.");
    }
}

// Bike.java
class Bike extends Vehicle {

    public Bike(char[] make, char[] model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    @Override
    public void drive() {
        System.out.print(make);
        System.out.print(" ");
        System.out.print(model);
        System.out.println(" Bike is driving.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        char[] carMake = {'T', 'o', 'y', 'o', 't', 'a'};
        char[] carModel = {'C', 'o', 'r', 'o', 'l', 'l', 'a'};
        Car car = new Car(carMake, carModel, 2020, 180);

        char[] bikeMake = {'Y', 'a', 'm', 'a', 'h', 'a'};
        char[] bikeModel = {'M', 'T', '-', '0', '7'};
        Bike bike = new Bike(bikeMake, bikeModel, 2021, 200);

        System.out.println("Car Details: ");
        System.out.print("Make: ");
        System.out.println(car.make);
        System.out.print("Model: ");
        System.out.println(car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Maximum Speed: " + car.maximumSpeed);
        car.drive();

        System.out.println("\nBike Details: ");
        System.out.print("Make: ");
        System.out.println(bike.make);
        System.out.print("Model: ");
        System.out.println(bike.model);
        System.out.println("Year: " + bike.year);
        System.out.println("Maximum Speed: " + bike.maximumSpeed);
        bike.drive();
    }
}

/*
Car Make: Toyota
Car Model: Corolla
Car Year: 2022
Car Maximum Speed: 180
Toyota Corolla Car is driving.

Bike Make: Yamaha
Bike Model: R15
Bike Year: 2023
Bike Maximum Speed: 140
Yamaha R15 Bike is driving.
*/