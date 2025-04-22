class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pt=new PriorityQueue<>();
        for(int num : nums){
            pt.offer(num);
            if(pt.size()>k){
                pt.poll();
            }
        }
        return pt.peek();
    }
}