class Pair{
    int row;
    int col;
    Pair(int r,int c){
        row=r;
        col=c;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        int[][] direction = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        Queue<Pair> q = new LinkedList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int r = 0;r<rows;r++){
            for(int c = 0;c<cols;c++){
                if(grid[r][c] == '1'){
                    grid[r][c] = '0';
                    q.add(new Pair(r,c));
                    count++;
                }
                while(!q.isEmpty()){
                    Pair cur = q.poll();
                    
                    for(int[] dir: direction){
                        
                        int nr = dir[0]+cur.row;
                        int nc = dir[1]+cur.col;
                        if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == '1'){
                            grid[nr][nc] = '0';
                            q.add(new Pair(nr,nc));
                        }
                    }
                }
            }
        }
        return count;
    }
}

