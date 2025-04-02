import java.util.Arrays;

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: Find the pivot (first decreasing element from the right)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot is found, reverse the entire array
        if (pivot == -1) {
            int start = 0, end = n - 1;
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
            return;
        }

        // Step 3: Find the next larger element to swap with pivot
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) { 
                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;
                break;
            }
        }

        // Step 4: Reverse the right part after pivot
        int start = pivot + 1, end = n - 1;
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 8, 7, 6, 5};
        System.out.println("Before: " + Arrays.toString(nums));

        Solution sol = new Solution();
        sol.nextPermutation(nums);

        System.out.println("After: " + Arrays.toString(nums)); // Expected Output: [2, 1, 8, 7, 6, 5] -> [2, 1, 8, 7, 6, 5]
    }
}
