package arun.basic;

public class methods {
    public static void main(String[] args) {
        int number = 91; // You can change this number to check for other values
        int a = 25;
        int b = 15;

        int c=gcd(a,b);
        System.out.println(c);
        int[] array = {12, 5, 27, 9, 31, 18, 42, 3};
        int max =max(array);
        System.out.println(max);

        if (prime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int gcd(int a,int b){
        // while(a!=b){
        //     if(a>b)a=a-b;
        //     else b=b-a;
        if(b==0){
            return a;
        }
        else{
            return(gcd(b,a%b));
        }


    }
    static int max(int[] A){
        if(A==null || A.length==0){
            throw new IllegalArgumentException("The array is empty or null.");
        }
        int max = A[0];
        for(int i=1;i<A.length;i++){
            if(A[i]>max){
                max=A[i];
            }
        }return max;
    }
}
