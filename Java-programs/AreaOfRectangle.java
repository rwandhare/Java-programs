/*1.Create an abstract class Shape with an abstract method calculateArea(). Implement two subclasses, Circle and Rectangle, which inherit from Shape and provide their own implementations of calculateArea(). Write a program to calculate and print the areas of a circle and a rectangle. */



// Define the abstract class Shape
abstract class Shape {
    abstract double calculateArea();
}

// Define the Circle class inheriting from Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Define the Rectangle class inheriting from Shape
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

// Main class to calculate and print the areas
public class AreaOfRectangle {
    public static void main(String[] args) {
        // Create a Circle object with radius 5
        Shape circle = new Circle(5);
        double circleArea = circle.calculateArea();
        System.out.println("The area of the circle is: " + circleArea);

        // Create a Rectangle object with width 4 and height 6
        Shape rectangle = new Rectangle(4, 6);
        double rectangleArea = rectangle.calculateArea();
        System.out.println("The area of the rectangle is: " + rectangleArea);
    }
}

/*
Output
The area of the circle is: 78.53981633974483
The area of the rectangle is: 24.0
*/