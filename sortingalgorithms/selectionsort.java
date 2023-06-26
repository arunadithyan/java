package arun.sortingalgorithms;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr={2,3,56,8,4,3,2};
        selectionsort1 (arr);
        System.out.println (Arrays.toString (arr));

    }
    static void selectionsort1(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last=arr.length-1-i;
            int maxindex =getmaxindex(arr,0,last);
//
            swap (arr,maxindex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int getmaxindex(int[] arr , int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }

}
