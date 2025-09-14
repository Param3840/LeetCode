class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int max = -1;
        int rowIndex = -1;
        for (int r = 0; r < mat.length; r++) {
            int count = 0;
            for (int c = 0; c < m; c++) {
                if (mat[r][c] == 1) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                rowIndex = r;
            }
        }
        return new int[] { rowIndex, max };
    }
}