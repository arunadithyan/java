package arun;

public class firstandlast {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target){
        int[] ans ={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1) {
        ans[1] =search(nums,target,false);}

        return ans;
    }
    public static int  search(int[] letters,int tar,boolean findindex){
        int ans=-1;
        int start =0;
        int end=letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (tar<letters[mid]){
                end=mid-1;
            }
            else if(tar>letters[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findindex){
                   end=mid-1 ;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
