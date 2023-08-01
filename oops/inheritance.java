package arun.oops;
import java.lang.Math;
    // Base class: Circle
    class Circle {
        protected double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double area() {
            return Math.PI * radius * radius;
        }
    }

    // Derived class: Cylinder (inherits from Circle)
    class Cylinder extends Circle {
        private double height;

        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        public double volume() {
            return area() * height;
        }
    }

public class inheritance{
        public static void main(String[] args) {
            double radiusCircle = 5;
            Circle circle = new Circle(radiusCircle);
            System.out.println("Circle Area: " + circle.area());

            double radiusCylinder = 5;
            double heightCylinder = 10;
            Cylinder cylinder = new Cylinder(radiusCylinder, heightCylinder);
            System.out.println("Cylinder Volume: " + cylinder.volume());
        }
    }



