public class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE; 
        int currentSum = 0; 
        int left = 0; 

        for (int right = 0; right < n; right++) {
            currentSum += nums[right]; 

            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1); 
                currentSum -= nums[left];
                left++; 
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        System.out.println("Test case 1 result: " + solution.minSubArrayLen(target1, nums1)); 

        
        int target2 = 4;
        int[] nums2 = {1, 4, 4};
        System.out.println("Test case 2 result: " + solution.minSubArrayLen(target2, nums2)); 

        
        int target3 = 11;
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Test case 3 result: " + solution.minSubArrayLen(target3, nums3)); 
    }
}
