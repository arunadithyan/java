package arun.basic;
import java.util.Scanner;

public class splitmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter an email ID: ");
        String email = scanner.nextLine ();

        String[] parts = email.split ("@");
        if (parts.length == 2) {
            String username = parts[0];
            String domain = parts[1];

            System.out.println ("Username: " + username);
            System.out.println ("Domain: " + domain);

            if (domain.equalsIgnoreCase ("gmail.com")) {
                System.out.println ("Yes");
            } else {
                System.out.println ("NOT A GMAIL");
            }
        }
        else{
            System.out.println ("INVALID EMAIL FORMAT");
        }
    }
}


