class pair{
    int row;
    int col;
    pair(int r,int c){
        row = r;
        col=c;
    }
}
class Solution {
    int[][] direction = new int[][] {{-1,0},{1,0},{0,-1},{0,1}};
    
    public void dfs(char[][] board, int row,int col,int rows,int cols){
        board[row][col] = '#';
        for(int[] dir : direction){
            int newRow = row + dir[0];
            int newCol = col+ dir[1];
            if(newRow<0||newRow>=rows|| newCol<0||newCol>=cols) continue;
            if(board[newRow][newCol]=='O'){
                dfs(board,newRow,newCol,rows,cols);
            }
        }
    }
    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0|| i==rows-1 ||j==0||j==cols-1){
                    if(board[i][j] =='O'){
                        dfs(board,i,j,rows,cols);
                    }
                }
            }
        }
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
               if(board[i][j]=='#'){
                board[i][j]='O';
               }
               else{
                board[i][j]='X';
               }
            }
        }
    }
}