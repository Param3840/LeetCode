class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    int ans=(nums[i]-1)*(nums[j]-1);
                    max=Math.max(ans,max);
                }
            }
        }
        return max;
    }
}