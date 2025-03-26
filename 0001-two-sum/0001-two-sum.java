class Solution {
      public static void printArray(int[]arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{}; 
    }
    public static void main(String[]args){
        int[]arr={2,7,11,15};
        int target=9;
        Solution solution=new Solution();
        int[]result=solution.twoSum(arr,target);
        printArray(result);
    }
}