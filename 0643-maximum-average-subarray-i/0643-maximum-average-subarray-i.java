class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            return -1;
        }
        double windSum=0;
        for(int i=0;i<k;i++){
            windSum=windSum+nums[i];
        }
        double maxSum=windSum;
        for(int i=k;i<n;i++){
            windSum=windSum+nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,windSum);
        }
        return maxSum/k;
    }
}