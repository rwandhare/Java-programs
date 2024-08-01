/*4. Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.*/

// Define the interface Drawable
interface Drawable {
    void draw();
}

// Implement the Drawable interface in Circle class
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
        // Logic to draw a circle
    }
}

// Implement the Drawable interface in Rectangle class
class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
        // Logic to draw a rectangle
    }
}

// Implement the Drawable interface in Triangle class
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
        // Logic to draw a triangle
    }
}

// Main class to test the implementation
public class MainDraw {
    public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        // Call the draw method for each object
        circle.draw();
        rectangle.draw();
        triangle.draw();
    }
}
/* 
Output

Drawing Circle
Drawing Rectangle
Drawing Triangle

*/


