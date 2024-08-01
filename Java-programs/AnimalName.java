/* 2. Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat. ● The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound." ● The Dog and Cat classes should override this method to print "TheCat/The dog meows/barks" respectively. ● The program should allow the user to create and display objects of each class.*/


import java.util.Scanner;

// Define the superclass Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Define the Dog class inheriting from Animal
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Define the Cat class inheriting from Animal
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Main class to demonstrate method overriding
public class AnimalName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to create and display objects
        System.out.println("Enter the type of animal (dog/cat): ");
        String animalType = scanner.nextLine();

        Animal animal;

        switch (animalType.toLowerCase()) {
            case "dog":
                animal = new Dog();
                break;
            case "cat":
                animal = new Cat();
                break;
            default:
                animal = new Animal();
                break;
        }

        animal.makeSound();
        scanner.close();
    }
}


/*
Output

Enter the type of animal (dog/cat): 
dog
The dog barks.

Enter the type of animal (dog/cat): 
cat
The cat meows.

Enter the type of animal (dog/cat): 
bird
The animal makes a sound.
*/

