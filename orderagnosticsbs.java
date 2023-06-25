package arun;

public class orderagnosticsbs {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1,0,-1};
        int target = 5;
        int a = orderagnosticsbs1(arr, target);
        System.out.println(a);
    }

    public static int orderagnosticsbs1(int[] arr, int tar) {
        int start = 0;
        int end = arr.length - 1;
        boolean asci = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tar == arr[mid]) {
                return mid;
            }
            if (asci) {
                if (tar < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (tar > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}




