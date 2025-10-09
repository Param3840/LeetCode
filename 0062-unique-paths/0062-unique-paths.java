class Solution {
    // public int uniquePaths(int m, int n) {
    //      return uniquePaths(0,0,m,n);
    // } 
    // public static int uniquePaths(int i,int j,int m ,int n){
    //     if (i==m-1 && j==n-1) return 1;
    //     if (i>=m || j>=n) return 0;

    //     int right=uniquePaths(i,j+1,m,n);
    //     int down=uniquePaths(i+1,j,m,n);
    //     return right+down;
    // }


    // MEMORIZATION 

    // public int uniquePaths(int m, int n) {
    //      int[][]dp=new int[m][n];
    //     for (int i=0;i<m;i++){
    //         Arrays.fill(dp[i],-1);
    //     }
    //     return uniqueMemorization(dp,0,0,m,n);
    // } 
    //     public static int uniqueMemorization(int[][]dp,int i,int j,int m,int n){
    //     if (i==m-1 && j==n-1) return 1;
    //     if (i>=m || j>=n) return 0;
    //     if (dp[i][j]!=-1) return dp[i][j];
    //     int right=uniqueMemorization(dp,i,j+1,m,n);
    //     int down=uniqueMemorization(dp,i+1,j,m,n);

    //     dp[i][j]=right+down;
    //     return dp[i][j];
    // }
        public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0 && j==0) {
                    dp[0][0]=1;
                }
                else {
                    int right = 0;
                    if (j>0){
                        right = dp[i][j - 1];
                    }
                    int down=0;
                    if (i>0) {
                        down = dp[i - 1][j];
                    }
                    dp[i][j] = right + down;
                }
            }
        }
        return dp[m-1][n-1];
    } 
}