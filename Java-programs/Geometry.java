/* 
2. ● Write a Java program to create a class called Shape with a method called getArea(). ● Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter. ● Override the getArea() method. ● Create a class called square that takes an attribute length. Create a constructor that takes length as input. ● Override the getArea() method. ● Create a subclass of Shape called Rectangle that takes width and height as input to the constructor. ● Override the getArea() method to calculate the area of a rectangle. Instantiate and call getArea() method.*/

// Base class Shape
class Shape {
    // Method to get the area of the shape
    public double getArea() {
        return 0.0;
    }
}

// Subclass Circle
class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(int radius) {
        this.radius = radius;
    }

    // Override getArea() method to calculate the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Subclass Square
class Square extends Shape {
    private int length;

    // Constructor
    public Square(int length) {
        this.length = length;
    }

    // Override getArea() method to calculate the area of the square
    @Override
    public double getArea() {
        return length * length;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Override getArea() method to calculate the area of the rectangle
    @Override
    public double getArea() {
        return width * height;
    }
}

// Main class to test the shapes
public class Main Geometry {
    public static void main(String[] args) {
        // Create instances of each shape
        Circle circle = new Circle(5);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 6);

        // Print the area of each shape
        System.out.println("Area of the circle: " + circle.getArea());
        System.out.println("Area of the square: " + square.getArea());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}


/*Output
Area of the circle: 78.53981633974483
Area of the square: 16.0
Area of the rectangle: 18.0
*/
