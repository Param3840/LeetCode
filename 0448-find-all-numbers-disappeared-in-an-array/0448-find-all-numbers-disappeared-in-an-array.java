class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hash=new HashSet<>();
        for (int num : nums){
            hash.add(num);
        }
        List<Integer> ls=new ArrayList<>();
        for (int i=1;i<=nums.length;i++){
            if (!hash.contains(i)){
                ls.add(i);
            }
        }
        return ls; 
    }
}