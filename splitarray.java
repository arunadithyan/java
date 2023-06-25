package arun;

public class splitarray {
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int result = splitArray(nums, k);
        System.out.println(result);
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int subarray = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    subarray++;
                } else {
                    sum += num;
                }
            }
            if (subarray > k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
