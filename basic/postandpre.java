package arun.basic;
import java.util.*;

public class postandpre {
    public static void main(String[] args) {
        int x,y,z;
        x=5;
        y=x++; //5 because here x is first assigned
        z=++x; //6 x is increased before
        System.out.println(x + ", " + y + ", " + z); //x=7 because again increasing

    }
}
