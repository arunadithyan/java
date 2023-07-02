package arun.basic;

public class printmethods {

        public static void main(String[] args) {
            int number = 42;
            String text = "Hello, World!";
            double decimal = 3.14159;

            // Using System.out.print
            System.out.print("Using System.out.print: ");
            System.out.print(number);
            System.out.print(" ");
            System.out.print(text);
            System.out.print(" ");
            System.out.print(decimal);
            System.out.println();

            // Using System.out.println
            System.out.println("Using System.out.println:");
            System.out.println(number);
            System.out.println(text);
            System.out.println(decimal);

            // Using System.out.printf
            System.out.printf("Using System.out.printf: number = %d, text = %s, decimal = %.2f%n", number, text, decimal);

            // Using System.out.format
            System.out.format("Using System.out.format: number = %d, text = %s, decimal = %.2f%n", number, text, decimal);
        }
    }
