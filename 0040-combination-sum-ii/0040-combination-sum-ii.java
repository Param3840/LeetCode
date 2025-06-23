class Solution {
    public static void combo(int idx, int target, int []arr, ArrayList<Integer> ds, List<List<Integer>>res){
        if(target==0){
            res.add(new ArrayList<>(ds));
            return;
        }
        for (int i=idx;i<arr.length;i++){
            if (i>idx && arr[i]==arr[i-1])  continue;
            if (arr[i]>target) break;

            ds.add(arr[i]);
            combo(i+1,target-arr[i],arr,ds,res);
            ds.remove(ds.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         List<List<Integer>> ans=new ArrayList<>();

        Arrays.sort(candidates);
        combo(0,target,candidates,new ArrayList<>(),ans);
        return ans;
    }
}