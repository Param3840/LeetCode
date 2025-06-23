class Solution {
        public static void per(int idx, int []arr,List<List<Integer>> ans){
        if (idx== arr.length){
            List<Integer> ds=new ArrayList<>();
            for (int num : arr){
                ds.add(num);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=idx;i< arr.length;i++){
            swap(i,idx,arr);
            per(idx+1,arr,ans);
            swap(i,idx,arr);
        }
    }
    public static void swap(int i,int j,int[] arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        per(0,nums,ans);
        return ans;
    }
}