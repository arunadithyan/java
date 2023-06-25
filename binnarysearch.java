package arun;

public class binnarysearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        int target=5;
        int a= binnarysearch1(arr,target);
        System.out.println(a);
    }
    public static int  binnarysearch1(int[] arr,int tar){
       int start =0;
       int end=arr.length-1;
       while(start<=end){
           int mid = start+(end-start)/2;
           if (tar<arr[mid]){
               end=mid-1;
           }
           else if(tar>arr[mid]){
               start=mid+1;
           }
           else{
               return mid;
           }
       }
       return -1;
    }
}
