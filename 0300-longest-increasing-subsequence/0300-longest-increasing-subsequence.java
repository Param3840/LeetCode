class Solution {
    public int lengthOfLIS(int[] nums) {
      int n= nums.length;
      int[]dp=new int[n+1];
      for(int i=0;i<n;i++){
          dp[i]=1;
      }
      int max=1;
      for (int i=1;i<n;i++){
          for (int j=0;j<i;j++){
              if (nums[i]>nums[j]){
                  dp[i]=Math.max(dp[i],dp[j]+1);
              }
          }
          max=Math.max(max,dp[i]);
      }
      return max;
    }
}