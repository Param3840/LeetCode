class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int num : nums1){
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        List<Integer> resultList=new ArrayList<>();
        for(int num : nums2){
            if(mp.containsKey(num) && mp.get(num)>0){
                resultList.add(num);
                mp.put(num,mp.get(num)-1);
            }
        }
        int [] res=new int[resultList.size()];
        int i=0;
        for(int num : resultList){
            res[i++]=num;
        }
        return res;
    }
}