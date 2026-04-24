class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n= nums.length;
        int count=0;
        int[]res=new int[n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (nums[i]>nums[j]){
                    count++;
                    res[i]=count;
                }
            }
            count=0;
        }
        return res;
    }
}