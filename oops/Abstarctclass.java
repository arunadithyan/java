// Shape.java (Abstract class)
package arun.oops;
abstract class Shape {
    // Abstract methods to be implemented by subclasses
    public abstract double getArea();
    public abstract double getPerimeter();
}

// Rectangle.java (Concrete class)
class Rectangle1 extends Shape {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract methods from Shape class
    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

// Circle.java (Concrete class)
class Circle1 extends Shape {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    // Implementing abstract methods from Shape class
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Main.java (Test the classes)
public class Abstarctclass{
    public static void main(String[] args) {
        Shape rectangle = new Rectangle1(5, 7);
        Shape circle = new Circle1(3);

        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
