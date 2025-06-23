class Solution {
    public static void sub(int idx, int[] arr , List<Integer>ls,List<List<Integer>> res){
        res.add(new ArrayList<>(ls));
        for (int i=idx;i< arr.length;i++){
            if (i> idx && arr[i]==arr[i-1]){
                continue;
            }
            ls.add(arr[i]);
            sub(i+1,arr,ls,res);
            ls.remove(ls.size()-1);
        }
    }
    public static List<List<Integer>> subsetsWithDup(int[]arr){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        sub(0,arr,new ArrayList<>(),ans);
        return ans;
    }
}