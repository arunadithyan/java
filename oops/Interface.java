package arun.oops;

// Shape.java (Interface)
interface Shape2 {
    // Abstract methods
    double getArea();
    double getPerimeter();
}

// Circle.java (Concrete class implementing Shape interface)
class Circle2 implements Shape2 {
    private double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    // Implementing methods from Shape interface
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// ShapeTest.java (Main class to test the classes)
public class Interface {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(3);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
    }
}
