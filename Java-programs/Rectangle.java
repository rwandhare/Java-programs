/* 2. Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.*/

public class Rectangle {
    // Private instance variables
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to calculate area of the rectangle
    public double calculateArea() {
        return length * width;
    }

    // Main method to test the Rectangle class
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Get and display rectangle details
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());

        // Modify rectangle details using setter methods
        rectangle.setLength(7.0);
        rectangle.setWidth(4.0);

        // Display modified rectangle details
        System.out.println("\nModified Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.calculateArea());
    }
}

/*
Output
Length: 5.0
Width: 3.0
Area: 15.0

Modified Details:
Length: 7.0
Width: 4.0
Area: 28.0

*/