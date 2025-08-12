class Solution {
    public int[][] generateMatrix(int n) {
         int [][] matrix=new int[n][n];
        int tr=0,br=n-1,lc=0,rc=n-1;
        int curr=1;
        while (curr<=n*n){
            for (int j=lc;j<=rc;j++){
                matrix[tr][j]=curr++;
            }
            tr++;
            for (int i=tr;i<=br;i++){
                matrix[i][rc]=curr++;
            }
            rc--;
            for(int j=rc;j>=lc;j--){
                matrix[br][j]=curr++;
            }
            br--;
            for (int i=br;i>=tr;i--){
                matrix[i][lc]=curr++;
            }
            lc++;
        }
        return matrix;
    }
}