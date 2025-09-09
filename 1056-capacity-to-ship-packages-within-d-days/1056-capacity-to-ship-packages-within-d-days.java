class Solution {
    public static int sum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static int maximum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }



    public static int func(int[] weights, int cap) {
        int day = 1, loadCap = 0;

        for (int i = 0; i < weights.length; i++) {
            if (loadCap + weights[i] > cap) {
                day = day + 1;
                loadCap = weights[i];
            } else {
                loadCap += weights[i];
            }
        }
        return day;
    }

    

    public int shipWithinDays(int[] weights, int days) {
        int low = maximum(weights);
        int high = sum(weights);

        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int reqDays = func(weights, mid);

            if (reqDays <= days) {
                high = mid - 1;
            } else {

                low = mid + 1;
            }
        }
        return low;
    }
}