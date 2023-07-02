package arun.basic;
import java.util.Arrays;
import java.util.regex.*;
import java.lang.*;
//regularexpression
public class regexexample {
    public static void main(String[] args) {
        String input = "Hello, Java!";
        String pattern = "Hello, (\\w+)!";

        boolean matches = Pattern.matches(pattern, input);
        System.out.println("Pattern matches input: " + matches);

        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        boolean found = matcher.find();
        if (found) {
            System.out.println("Pattern found in input");
        } else {
            System.out.println("Pattern not found in input");
        }

        String[] fruits = input.split(",");
        System.out.println("Splitting input by comma:");
        System.out.println(Arrays.toString(fruits));

        String replacement = "Universe";
        String replaced = input.replaceAll(pattern, replacement);
        System.out.println("Replaced input: " + replaced);

        String extractedText = extractText(input, pattern);
        System.out.println("Extracted text from input: " + extractedText);
    }

    public static String extractText(String input, String pattern) {
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        if (matcher.find()) {
            return matcher.group(1);
        } else {
            return "";
        }
    }
}


