package arun.basic;
import java.util.*;

public class stringdemo {
        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "World";

            // Concatenation
            String concat = str1 + " " + str2;
            System.out.println("Concatenation: " + concat);

            // Length
            int length = str1.length();
            System.out.println("Length of str1: " + length);

            // Character at index
            char charAt = str2.charAt(0);
            System.out.println("Character at index 0 of str2: " + charAt);

            // Substring
            String substring = str1.substring(1, 4);
            System.out.println("Substring of str1 from index 1 to 3: " + substring);

            // Concatenating strings using StringBuilder
            StringBuilder sb = new StringBuilder();
            sb.append(str1);
            sb.append(" ");
            sb.append(str2);
            String sbConcat = sb.toString();
            System.out.println("StringBuilder concatenation: " + sbConcat);

            // Comparison
            boolean equals = str1.equals(str2);
            System.out.println("str1 equals str2: " + equals);

            boolean equalsIgnoreCase = str1.equalsIgnoreCase("hello");
            System.out.println("str1 equalsIgnoreCase \"hello\": " + equalsIgnoreCase);

            int compareTo = str1.compareTo(str2);
            System.out.println("str1 compareTo str2: " + compareTo);

            // Searching
            boolean contains = concat.contains("World");
            System.out.println("concat contains \"World\": " + contains);

            boolean startsWith = str1.startsWith("He");
            System.out.println("str1 starts with \"He\": " + startsWith);

            boolean endsWith = str2.endsWith("ld");
            System.out.println("str2 ends with \"ld\": " + endsWith);

            int indexOf = concat.indexOf("World");
            System.out.println("Index of \"World\" in concat: " + indexOf);

            // Splitting
            String[] split = concat.split(" ");
            System.out.println("Splitting concat at space: ");
            for (String s : split) {
                System.out.println(s);
            }

            // Replacing
            String replaced = concat.replace("World", "Universe");
            System.out.println("Replacing \"World\" with \"Universe\": " + replaced);

            // Uppercase and lowercase
            String uppercase = str1.toUpperCase();
            System.out.println("Uppercase of str1: " + uppercase);

            String lowercase = str2.toLowerCase();
            System.out.println("Lowercase of str2: " + lowercase);
        }
    }


