class Solution {
    public static boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int count = 0;
        int noOfBouquets = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                noOfBouquets += (count / k);
                count = 0;
            }
        }


        noOfBouquets += (count / k);

        return noOfBouquets >= m; 
    }

    public static int minimum(int[] bloomDay) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < min) {
                min = bloomDay[i];
            }
        }
        return min;
    }

    public static int maximum(int[] bloomDay) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }
        return max;
    }

  

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length)
            return -1;
        int low = minimum(bloomDay);
        int high = maximum(bloomDay);

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}