// Shape.java
public abstract class Shape {
    // Abstract method to be overridden
    public abstract double getArea();
}

// Circle.java
public class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Overriding the getArea() method
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square.java
public class Square extends Shape {
    private int length;

    // Constructor
    public Square(int length) {
        this.length = length;
    }

    // Overriding the getArea() method
    @Override
    public double getArea() {
        return length * length;
    }
}

// Rectangle.java
public class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Overriding the getArea() method
    @Override
    public double getArea() {
        return width * height;
    }
}

// Main.java
public class Main1 {
    public static void main(String[] args) {
        // Instantiating Circle, Square, and Rectangle objects
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 7);

        // Printing the area of Circle
        System.out.println("Circle Area: " + circle.getArea());

        // Printing the area of Square
        System.out.println("Square Area: " + square.getArea());

        // Printing the area of Rectangle
        System.out.println("Rectangle Area: " + rectangle.getArea());
    }
}
