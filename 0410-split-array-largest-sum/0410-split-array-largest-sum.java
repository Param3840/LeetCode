class Solution {
    public static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sumOfAnArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }



    public static int func(int[] arr, int pages) {
        int studnet = 1;
        int pagesStudent = 0;

        for (int i = 0; i < arr.length; i++) {
            if (pagesStudent + arr[i] <= pages) {
                pagesStudent += arr[i];
            } else {
                studnet++;
                pagesStudent = arr[i];
            }
        }
        return studnet;
    }

    

    public int splitArray(int[] nums, int k) {
        int low = maximum(nums);
        int high = sumOfAnArray(nums);
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int studentCount = func(nums, mid);
            if (studentCount <= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}