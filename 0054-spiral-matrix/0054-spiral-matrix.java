class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          List<Integer> result = new ArrayList<>();

        // Edge case: if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int topRow = 0;
        int bottomRow = matrix.length - 1;
        int leftCol = 0;
        int rightCol = matrix[0].length - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {

            for (int j = leftCol; j <= rightCol; j++) {
                result.add(matrix[topRow][j]);
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                result.add(matrix[i][rightCol]);
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int j = rightCol; j >= leftCol; j--) {
                    result.add(matrix[bottomRow][j]);
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    result.add(matrix[i][leftCol]);
                }
                leftCol++;
            }
        }
        return result;
    }
}