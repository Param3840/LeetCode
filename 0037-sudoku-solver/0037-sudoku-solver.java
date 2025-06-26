class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
     public static boolean solve(char[][] board){
        for (int i=0;i< board.length;i++){
            for (int j=0;j<board[i].length;j++){
                if (board[i][j]=='.'){
                    for (char ch='1';ch<='9';ch++){
                        if (isPossible(board,i,j,ch)){
                            board[i][j]=ch;
                            if (solve(board)==true){
                                return true;
                            }
                            else {
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isPossible(char[][] board,int row,int col,char ch){
        for (int i=0;i<9;i++){
            if (board[i][col]==ch) return false;
            if(board[row][i]==ch) return false;
        }
        int sRow=row/3*3;
        int sCol=col/3*3;
        for (int i=sRow;i<sRow+3;i++){
            for (int j=sCol;j<sCol+3;j++){
                if(board[i][j]==ch) return false;
            }
        }
        return true;
    }
}