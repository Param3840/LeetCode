class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         List<List<Integer>> res=new ArrayList<>();
        Set<List<Integer>>st=new HashSet<>();

        for (int i=0;i< nums.length;i++){
            Set<Integer> hash=new HashSet<>();
            for (int j=i+1;j< nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if (hash.contains(third)){
                    List<Integer> ls=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(ls);
                    st.add(ls);
                }
                else {
                    hash.add(nums[j]);
                }
            }
        }
        res.addAll(st);
        return res;
    }
}