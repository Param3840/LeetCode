class Solution {
    public static void per(int[]nums , List<Integer> ds , List<List<Integer>> ans , boolean[] freq){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(! freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                per(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        boolean [] freq=new boolean[nums.length];
        per(nums,new ArrayList<>(),ans,freq);
        return ans;
    }
}