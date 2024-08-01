/*1. Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.*/

// Define the Flyable interface

interface Flyable {
    void fly_obj();
}

// Implement the Flyable interface in the Spacecraft class
class Spacecraft implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Spacecraft is flying in space.");
    }
}

// Implement the Flyable interface in the Airplane class
class Airplane implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

// Implement the Flyable interface in the Helicopter class
class Helicopter implements Flyable {
    @Override
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

public class SpaceWork {
    public static void main(String[] args) {
        // Create objects of each class and call the fly_obj() method
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.fly_obj();

        Airplane airplane = new Airplane();
        airplane.fly_obj();

        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();
    }
}


/*
Output
Spacecraft is flying in space.
Airplane is flying in the sky.
Helicopter is flying in the air.
*/