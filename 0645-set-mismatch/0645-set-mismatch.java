class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        for (int i: nums){
            if (!mp.containsKey(i)){
                mp.put(i,1);
            }
            else {
                mp.put(i,mp.get(i)+1);
            }
        }
        int dup=-1;
        int missing=-1;
        for (int i=1;i<=n;i++) {
            if (mp.containsKey(i)){
                if (mp.get(i)>1){
                    dup=i;
                }
            }
            else {
                missing=i;
            }
        }

        int[]res=new int[2];
        res[0]=dup;
        res[1]=missing;
        return res;
    }
}