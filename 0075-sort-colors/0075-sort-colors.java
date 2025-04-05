class Solution {
    public static void swap(int[]arr,int left,int right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
    }
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
       while(mid<=high){
         if(nums[mid]==0){
            swap(nums,mid,low);
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums,mid,high);
            high--;
        }
       }
    }
}