class Solution {
    public int minFallingPathSum(int[][] matrix) {
          int n= matrix.length;
        int[][]dp=new int[n][n];
        int min=Integer.MAX_VALUE;
        for (int col=0;col<n;col++){
            dp[0][col]=matrix[0][col];
        }
        for (int row=1;row<n;row++){
            for (int col=0;col<n;col++){
                int up=matrix[row][col]+dp[row-1][col];

                int leftDiagonal=(int)1e9 ;
                if (col-1>=0){
                    leftDiagonal=matrix[row][col]+dp[row-1][col-1];
                }
                int rightDiagonal=(int)1e9 ;
                if (col+1<n){
                    rightDiagonal=matrix[row][col]+dp[row-1][col+1];
                }
                dp[row][col]=Math.min(up,Math.min(leftDiagonal,rightDiagonal));
            }

        }
        int result=Integer.MAX_VALUE;
        int lastRow=n-1;
        for (int col=0;col<n;col++){
            result=Math.min(result,dp[lastRow][col]);
        }
        return result;
    }
}