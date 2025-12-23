// class Pair{
//     int row;
//     int col;
//     Pair(int r,int c){
//         row=r;
//         col=c;
//     }
// }
// class Solution {
//     public int numIslands(char[][] grid) {
//         int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};
//         Queue<Pair> q = new LinkedList<>();
//         int rows = grid.length;
//         int cols = grid[0].length;
//         int count = 0;

//         for(int r = 0;r<rows;r++){
//             for(int c = 0;c<cols;c++){
//                 if(grid[r][c] == "1") count++;
//                 grid[r][c] = "0";
//                 q.add(new Pair(r,c));                
//             }
//         }
//         while(!q.isEmpty()){
//             Pair cur = q.poll();
//             for(int k = 0;k<4;k++){
//                 int nr = cur.row + dir[k][0];
//                 int nc = cur.col + dir[k][1];

//                 if (nr >= 0 && nc >= 0 &&
//                     nr < grid.length &&
//                     nc < grid[0].length &&
//                     grid[nr][nc] == '1') {

//                     grid[nr][nc] = '0';
//                     q.add(new Pair(nr, nc));
//                 }
//             }
//         }
//         return count;
//     }
// }
class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int r = 0;r<grid.length;r++){
            for(int c = 0;c<grid[0].length;c++){
                if(grid[r][c]=='1'){
                    dfs(grid,r,c);
                    count++;
                }
            }
        }
        return count;
    }
    void dfs(char[][] grid,int i , int j ){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0') return ;
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    };
}