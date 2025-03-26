class Solution {
    public int[] searchRange(int[] nums, int target) {
          int firstIndex=-1;
        int lastIndex=-1;
        for (int i=0;i< nums.length;i++){
            if (nums[i]==target){
                if (firstIndex==-1){
                    firstIndex=i;
                }
                lastIndex=i;
            }
        }
        return new int[]{firstIndex,lastIndex};
    }
}