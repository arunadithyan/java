package arun.basic;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class datepattern {
    public static void main(String[] args) {
            String date1 = "2023-07-04";
            String date2 = "07/04/2023";
            String date3 = "4th July, 2023";

            String pattern = "\\d{4}-(0[1-9]|1[0-2])-([0-2][1-9]|3[01])"; // YYYY-MM-DD format

            Pattern compiledPattern = Pattern.compile(pattern);

            Matcher matcher1 = compiledPattern.matcher(date1);
            Matcher matcher2 = compiledPattern.matcher(date2);
            Matcher matcher3 = compiledPattern.matcher(date3);

            System.out.println("Date 1 matches: " + matcher1.matches());
            System.out.println("Date 2 matches: " + matcher2.matches());
            System.out.println("Date 3 matches: " + matcher3.matches());
        }
    }



