class Solution {
    public static boolean solve(char[][] board){
        for(int row = 0;row<9;row++){
            for(int col = 0;col<9;col++){
                if(board[row][col] == '.'){
                    for(char num = '1';num<='9';num++){
                        if(isValid(board,row,col,num)){
                            board[row][col] = num;
                            if(solve(board)) return true;
                            board[row][col] ='.';                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isValid(char[][] board, int row,int col, int num){
        for(int i = 0;i<9;i++){
            if(board[row][i] == num || board[i][col] == num) return false;
        }
        int subr = row/3*3;
        int subc = col/3*3;
        for(int i = subr;i<subr+3;i++){
            for(int j = subc;j<subc+3;j++){
                if(board[i][j] == num) return false;
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}