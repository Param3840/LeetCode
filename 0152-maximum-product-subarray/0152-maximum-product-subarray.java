class Solution {
    public int maxProduct(int[] nums) {
        
        if (nums.length==0){
            return 0;
        }
        int maxP=nums[0];
        int minP=nums[0];
        int result=nums[0];

        for (int i=1;i< nums.length;i++){
            int current=nums[i];
            if (current<0){
                int temp=maxP;
                maxP=minP;
                minP=temp;
            }
            maxP=Math.max(current,maxP*current);
            minP=Math.min(current,minP*current);
            result=Math.max(result,maxP);
        }
        return result;
    }
}