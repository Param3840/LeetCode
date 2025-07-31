class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        for (int i=0;i<nums.length;i++){
            if (mp.get(nums[i])==1){
             return nums[i];
           }
        }
        return -1;
    }
}