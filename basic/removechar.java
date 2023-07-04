package arun.basic;

public class removechar {
    public static void main(String[] args) {
        String input = "Hello!@#$% How   are you ?";
        String words = "  This is a sample     sentence";
        String re= "      hi";
        String result1 = input.replaceAll("[^a-zA-Z0-9 &?]", "");
        //removes all spaces
        String result2 = result1.replaceAll("\\s", "");
        //removing extra spaces
        String result3 =result1.replaceAll("\\s+"," ").trim();//it trims the both front and end
        String words1 =words.replaceAll("\\s+"," ").trim();
        String[] wordArray = words1.split("\\s");
        int numberOfWords = wordArray.length;


        System.out.println("Original string: " + input);
        System.out.println("String without special characters: " + result1);
        System.out.println("String without special characters: " + result2);
        System.out.println("String without special & extra spaces characters: " + result3);
        System.out.println("Trimed string: " + re.trim());
        System.out.println("Number of words: " + numberOfWords);





    }
}


