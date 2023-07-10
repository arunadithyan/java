package arun.basic;

public class RotateArray {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        System.out.println("Initial Array");
        for(int x:a){
            System.out.print(x+" ");
        }
        int temp = a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=temp;
        System.out.println();
        System.out.println("Rotated Array");
        for(int x:a){
            System.out.print(x+" ");
        }

    }
}
