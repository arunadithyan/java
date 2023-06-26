package arun.sortingalgorithms;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int[] arr={1,8,3,4,5};
        bubblesort1(arr);

        System.out.println (Arrays.toString (arr));

    }
    static void bubblesort1(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }

            }
        }
    }
}
