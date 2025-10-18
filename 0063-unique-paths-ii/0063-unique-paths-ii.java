class Solution {
    //     public class LeetCodeUniquePath63 {
    //     public static int uni(int[][] grid){
    //         int m= grid.length;
    //         int n= grid[0].length;
    //         return uniquePaths(0,0,m,n,grid);
    //     }
    //     public static int uniquePaths(int i,int j,int m,int n,int[][]grid){
    //         if (i==m-1 && j==n-1 ) return 1;
    //         if (i>=m || j>=n || grid[i][j] ==1) return 0;
    //             int left=uniquePaths(i,j+1,m,n,grid);
    //             int bottom=uniquePaths(i+1,j,m,n,grid);

    //         return left+bottom;
    //     }
    // //    MEMORIZATION
    //     public static int implementDp(int[][]grid){
    //         int m= grid.length;
    //         int n=grid[0].length;
    //         int[][] dp=new int[m][n];
    //         for (int i=0;i<m;i++){
    //             Arrays.fill(dp[i],-1);
    //         }
    //         return uniquePathsMemo(0,0,m,n,grid,dp);
    //     }
    //     public static int uniquePathsMemo(int i,int j,int m,int n,int[][]grid,int[][]dp){
    //         if (i==m-1 && j==n-1 ) return 1;
    //         if (i>=m || j>=n || grid[i][j] ==1) return 0;
    //         if (dp[i][j] !=-1) return dp[i][j];
    //         int left=uniquePathsMemo(i,j+1,m,n,grid,dp);
    //         int bottom=uniquePathsMemo(i+1,j,m,n,grid,dp);

    //         dp[i][j]=left+bottom;
    //         return dp[i][j];
    //     }
    //    TABULATION

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1)
            return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                } else if (obstacleGrid[i][j] == 1)
                    obstacleGrid[i][j] = 0;
                else {
                    int right = 0;
                    if (j > 0) {
                        right = dp[i][j - 1];
                    }
                    int down = 0;
                    if (i > 0) {
                        down = dp[i - 1][j];
                    }
                    dp[i][j] = right + down;
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}