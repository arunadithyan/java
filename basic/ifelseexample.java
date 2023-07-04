package arun.basic;

import java.util.Scanner;

public class ifelseexample {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a =in.nextInt();
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        System.out.print("Enter the age ");
        int age=in.nextInt();
        if(age>=14){
            System.out.println("old");
        }else{
            System.out.println("young");
        }

        //radix is system number
        //binary -2 ,octal -8 , hexadecimal -16, decimal -10
        String num;
        System.out.print("Enter a number ");
        num=in.next();
        if(num.matches("[01]+")){
            System.out.println("Binary number radix =2");
        }
        else if (num.matches("[0-7]+")){
            System.out.println("Octal number radix =8");
        }
        else if (num.matches("[0-9]+")){
            System.out.println("Decimal number radix =10");
        }
        else if (num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal number radix =16");
        }
        else{
            System.out.println("Invalid number");
        }

        //finding leap year
        System.out.print("Enter the year: ");
        int c = in.nextInt();

        if (c % 4 == 0) {
            if (c % 100 == 0) {
                if (c % 400 == 0) {
                    System.out.println("It's a leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("It's a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}
