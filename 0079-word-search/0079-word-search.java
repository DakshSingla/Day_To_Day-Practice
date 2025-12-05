class Solution {
    int[][] direction = new int[][] {{0,-1},{0,1},{-1,0},{1,0}};
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        char a = word.charAt(0);
        for(int i = 0;i<=n - 1;i++){
            for(int j = 0;j<=m - 1;j++){
                if(board[i][j]== a){   
                    if(dfs(board,word,0,i,j)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board,String word,int index,int i, int j){
        if(index == word.length() - 1){
            return true;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        for(int[] dir:direction){
            int newrow = i+dir[0];
            int newcol = j+dir[1];
            if(newrow<0 || newcol<0||newrow>=board.length||newcol>=board[0].length){
                continue;
            }
            if(board[newrow][newcol]==word.charAt(index + 1)){
                if(dfs(board,word,index+1,newrow,newcol)){
                    board[i][j] = temp;
                    return true;
                }
            }
        }
        board[i][j] = temp;
        return false;
    }
}