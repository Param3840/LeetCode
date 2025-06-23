class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> ans=new ArrayList<>();
     combination(0,target,candidates,new ArrayList<>(),ans);
     return ans;
    }
      public static void combination(int i, int target, int[] arr, ArrayList<Integer>lt,List<List<Integer>> ans){
       if (target==0){
           ans.add(new ArrayList<>(lt));
           return;
       }
       if (target<0 || i==arr.length){
           return;
       }
       lt.add(arr[i]);
       combination(i,target-arr[i],arr,lt,ans);
       lt.remove(lt.size()-1);
       combination(i+1,target,arr,lt,ans);
    }
}