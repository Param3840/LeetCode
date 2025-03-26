class NumMatrix {
    private int[][] matrix;
    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
      
        for (int j = 0; j < c; j++) {
            for (int i = 1; i < r; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }

        this.matrix = matrix; 
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = matrix[row2][col2];

        if (row1 > 0) {
            sum -= matrix[row1 - 1][col2];  
        }

        if (col1 > 0) {
            sum -= matrix[row2][col1 - 1];  
        }

        if (row1 > 0 && col1 > 0) {
            sum += matrix[row1 - 1][col1 - 1]; 
        }

        return sum;
    }
}

public class Solution {
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int l1 = 1;
        int r1 = 1;
        int l2 = 2;
        int r2 = 2;

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        NumMatrix numMatrix = new NumMatrix(matrix);

        System.out.println("Matrix after numMatrix:");
        printMatrix(matrix);

        int ans = numMatrix.sumRegion(l1, r1, l2, r2);
        System.out.println("Sum of the specified range: " + ans);
    }
}
