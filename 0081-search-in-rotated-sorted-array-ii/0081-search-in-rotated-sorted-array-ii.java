class Solution {
    public boolean search(int[] nums, int target) {
           int st = 0, end = nums.length - 1;

                   while (st <= end) {
                               int mid = st + (end - st) / 2;

                                           if (nums[mid] == target) return true;

                                                       // If right half is sorted
                                                                   if (nums[mid] < nums[end]) {
                                                                                   if (target > nums[mid] && target <= nums[end]) {
                                                                                                       st = mid + 1;
                                                                                                                       } else {
                                                                                                                                           end = mid - 1;
                                                                                                                                                           }
                                                                                                                                                                       }
                                                                                                                                                                                   // If left half is sorted
                                                                                                                                                                                               else if (nums[mid] > nums[end]) {
                                                                                                                                                                                                               if (target >= nums[st] && target < nums[mid]) {
                                                                                                                                                                                                                                   end = mid - 1;
                                                                                                                                                                                                                                                   } else {
                                                                                                                                                                                                                                                                       st = mid + 1;
                                                                                                                                                                                                                                                                                       }
                                                                                                                                                                                                                                                                                                   }
                                                                                                                                                                                                                                                                                                               // nums[mid] == nums[end], duplicates: shrink search space
                                                                                                                                                                                                                                                                                                                           else {
                                                                                                                                                                                                                                                                                                                                           end--;
                                                                                                                                                                                                                                                                                                                                                       }
                                                                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                                                                                       return false;
    }
}