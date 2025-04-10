class Solution {
    public static int countLess(int[][]matrix,int mid){
        int noSmall=0;
        for (int i=0;i<matrix.length;i++){
            int start=0;
            int end=matrix[i].length-1;
            while (start<=end){
                int median=start+(end-start)/2;
                if (matrix[i][median]<=mid){
                    start=median+1;
                }
                else {
                    end=median-1;
                }
            }
            noSmall+=start;
        }
        return noSmall;
    }
    public int kthSmallest(int[][] matrix, int k) {
               int n=matrix.length;
        int low=matrix[0][0];
        int high=matrix[n-1][n-1];

        while (low<high){
            int mid=low+(high-low)/2;
            int count=countLess(matrix,mid);

            if (count<k) {
                low = mid + 1;
            }
            else {
                high=mid-1;
            }
        }
        return low;
    }
}