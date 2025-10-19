class Solution {
    //    public int minimumTotal(List<List<Integer>> triangle) {
    //        return tri(0,0,triangle);
    //    }
    //    public static int tri(int i, int j, List<List<Integer>> ls ){
    //        int n= ls.size();
    //        if (i==n-1) return ls.get(i).get(j);
    //        int down=ls.get(i).get(j)+tri(i+1,j,ls);
    //        int diagonal=ls.get(i).get(j)+tri(i+1,j+1,ls);
    //
    //        return Math.min(down,diagonal);
    //    }
    ////    MEMORIZATION
    //
    //    public static int minimumMemorization(List<List<Integer>> triangle){
    //        int n=triangle.size();
    //        int[][] dp=new int[n+1][n+1];
    //
    //        for (int i=0;i<n;i++){
    //            Arrays.fill(dp[i],-1);
    //        }
    //        return triMemo(0,0,triangle,dp);
    //    }
    //    public static int triMemo(int i, int j, List<List<Integer>> ls ,int[][]dp){
    //        int n= ls.size();
    //        if (i==n-1) return ls.get(i).get(j);
    //        if (dp[i][j]!=-1) return dp[i][j];
    //        int down=ls.get(i).get(j)+triMemo(i+1,j,ls,dp);
    //        int diagonal=ls.get(i).get(j)+triMemo(i+1,j+1,ls,dp);
    //        dp[i][j]=Math.min(down,diagonal);
    //        return dp[i][j];
    //    }
    //    TABULATION
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int down = triangle.get(i).get(j) + dp[i + 1][j];
                int diagonal = triangle.get(i).get(j) + dp[i + 1][j + 1];
                dp[i][j] = Math.min(down, diagonal);
            }
        }
        return dp[0][0];
    }
}