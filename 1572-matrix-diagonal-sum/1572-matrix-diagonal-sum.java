class Solution {
    public int diagonalSum(int[][] mat) {
         int sum1=0;
        for (int i=0;i< mat.length;i++){
                    sum1=sum1+mat[i][i];
                    sum1=sum1+mat[i][mat.length-1-i];
        
        }
        if (mat.length%2!=0){
            sum1=sum1-mat[mat.length/2][mat.length/2];
        }
        return sum1;
    }
}