package arun.basic;

public class bitwise {
    public static void main(String[] args) {
            int a = 5; // binary: 00000101
            int b = 3; // binary: 00000011

            // Bitwise AND
            int resultAnd = a & b; // binary: 00000001, decimal: 1
            System.out.println("Bitwise AND: " + resultAnd);

            // Bitwise OR
            int resultOr = a | b; // binary: 00000111, decimal: 7
            System.out.println("Bitwise OR: " + resultOr);

            // Bitwise XOR
            int resultXor = a ^ b; // binary: 00000110, decimal: 6
            System.out.println("Bitwise XOR: " + resultXor);

            // Bitwise NOT
            int resultNotA = ~a; // binary: 11111010, decimal: -6
            System.out.println("Bitwise NOT for a: " + resultNotA);

            int resultNotB = ~b; // binary: 11111100, decimal: -4
            System.out.println("Bitwise NOT for b: " + resultNotB);

            // Left Shift
            int resultLeftShift = a << 2; // binary: 00010100, decimal: 20
            System.out.println("Left Shift: " + resultLeftShift);

            // Right Shift
            int resultRightShift = a >> 2; // binary: 00000001, decimal: 1
            System.out.println("Right Shift: " + resultRightShift);


        boolean resultLogicalAnd = (a > 0) && (b < 5); // logical AND
        System.out.println("Logical AND: " + resultLogicalAnd);

        int resultBitwiseAnd = a & b; // bitwise AND
        System.out.println("Bitwise AND: " + resultBitwiseAnd);

    }

}
