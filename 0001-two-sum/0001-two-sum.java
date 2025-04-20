class Solution {
      public static void printArray(int[]arr){
        int[] ans={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int partner=target-arr[i];
            if (mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }
            else {
                mp.put(arr[i],i);
            }
        }
        return  ans;
    }
    public static void main(String[]args){
        int[]arr={2,7,11,15};
        int target=9;
        Solution solution=new Solution();
        int[]result=solution.twoSum(arr,target);
        printArray(result);
    }
}