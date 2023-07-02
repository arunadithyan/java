package arun.basic;

import java.util.Scanner;

public class areaoftri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number (1-for base and height  or 2-for three sides): ");
        String a = in.next();

        if (a.equals("2")) {
            base2();
        } else {
            base1();
        }

        in.close();
    }

    static void base1() {
        float area, height, base;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base and height: ");
        base = in.nextFloat();
        height = in.nextFloat();
        area = base * height / 2;
        System.out.println("Area of triangle is " + area);
        in.close();
    }

    static void base2() {
        float area, side1, side2, side3;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the lengths of three sides: ");
        side1 = in.nextFloat();
        side2 = in.nextFloat();
        side3 = in.nextFloat();

        // Check if triangle inequality theorem is satisfied
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            // Calculate the semiperimeter
            float s = (side1 + side2 + side3) / 2;

            // Calculate the area using Heron's formula
            area = (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            System.out.println("Area of triangle is " + area);
        } else {
            System.out.println("Invalid side lengths. Triangle cannot be formed.");
        }

        in.close();
    }
}
