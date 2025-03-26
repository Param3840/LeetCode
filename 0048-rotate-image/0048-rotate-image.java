public class Solution {
    
    public void rotate(int[][] matrix) {
        int n = matrix.length;  

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Solution solution = new Solution();
          Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int r= sc.nextInt();
        System.out.println("Enter no of columns ");
        int c= sc.nextInt();
        int [][]matrix=new int[r][c];
        System.out.println("Enter the elements ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        printMatrix(matrix);
           solution.rotate(matrix); 
        
        System.out.println("Rotated matrix:");
        printMatrix(matrix);  
    }
}
