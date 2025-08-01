class Solution {
    public int minSubarray(int[] nums, int p) {
       int n = nums.length;
        long sum = 0;
        for (int num : nums) sum += num;

        int target = (int)(sum % p);
        if (target == 0) return 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, -1);

        int curr = 0;
        int result = n;

        for (int j = 0; j < n; j++) {
            curr = (curr + nums[j]) % p;
            int remain = (curr - target + p) % p;

            if (mp.containsKey(remain)) {
                result = Math.min(result, j - mp.get(remain));
            }

            // \U0001f539 Update after checking
            mp.put(curr, j);
        }

        return result == n ? -1 : result;
    }
}