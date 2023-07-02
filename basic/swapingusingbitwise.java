package arun.basic;

public class swapingusingbitwise {
    public static void main(String[] args) {
                int a = 5;
                int b = 3;

                System.out.println("Before swapping:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);

                a = a ^ b; // XOR operation to get the bitwise XOR of a and b
                b = a ^ b; // XOR operation to get the original value of a (stored in b)
                a = a ^ b; // XOR operation to get the original value of b (stored in a)

                System.out.println("After swapping:");
                System.out.println("a = " + a);
                System.out.println("b = " + b);
            }
        }
