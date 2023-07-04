package arun.basic;

public class removechar {
    public static void main(String[] args) {
        String input = "Hello!@#$% How are you ?";
        String result1 = input.replaceAll("[^a-zA-Z0-9 &?]", "");
        String result2 = result1.replaceAll("\\s", "");

        System.out.println("Original string: " + input);
        System.out.println("String without special characters: " + result1);
        System.out.println("String without special characters: " + result2);
    }
}


