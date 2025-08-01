class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        mp.put(0,1);
        int sum=0;
        int res=0;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int mod=sum%k;
            if (mod<0){
                mod=mod%k+k;
            }
            if (mp.containsKey(mod)){
                res=res+mp.get(mod);
            }
            mp.put(mod,mp.getOrDefault(mod,0)+1);
        }
        return res;
    }
}