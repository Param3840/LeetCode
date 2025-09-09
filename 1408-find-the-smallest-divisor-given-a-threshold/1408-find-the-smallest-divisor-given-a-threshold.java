class Solution {
    public static int maximum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }



    public static int sum(int[] nums, int d) {
        int max = maximum(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (int) Math.ceil((double) nums[i] / d);
        }
        return sum;
    }

   

    public int smallestDivisor(int[] nums, int threshold) {
        int max = maximum(nums);
        int low = 1;
        int high = max;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sum(nums, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}