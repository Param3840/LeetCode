import java.util.Arrays;

class Solution {
    public static int[] merged(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            mergedArray[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            mergedArray[index++] = arr2[i];
        }

        Arrays.sort(mergedArray);
        return mergedArray;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = merged(nums1, nums2);

        int n = mergedArray.length;
        if (n % 2 == 0) {
            return (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
        } else {
            return mergedArray[n / 2];
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example arrays
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        
        // Call the findMedianSortedArrays method
        double ret = solution.findMedianSortedArrays(arr1, arr2);
        
        // Print the result (median)
        System.out.println("Median: " + ret);  // Output should be 2.0
    }
}
