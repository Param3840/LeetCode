class Solution {
     public void sub(int i, int[]arr, List<List<Integer>> res,List<Integer>ans){
        int n= arr.length;
        if (i==n){
            res.add(new ArrayList<>(ans));
            return;
        }
        ans.add(arr[i]);
        sub(i+1,arr,res,ans);
        ans.remove(ans.size()-1);
        sub(i+1,arr,res,ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        sub(0,nums,res,ans);
        return res;
    }
}