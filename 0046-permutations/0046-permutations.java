class Solution {
        public static void per(int[]arr,List<List<Integer>>res,List<Integer>ans,boolean[]freq){
        if (ans.size()== arr.length){
            res.add(new ArrayList<>(ans));
            return;
        }
        for (int i=0;i< arr.length;i++){
            if (!freq[i]) {
                freq[i] = true;
                ans.add(arr[i]);
                per(arr, res, ans, freq);
                ans.remove(ans.size() - 1);
                freq[i] = false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
          List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        boolean[] freq=new boolean[nums.length];
        per(nums,res,ans,freq);
        return res;
    }
}