class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int pend = 0;
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j]== 1){
                    pend++;
                }
                else if (grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
            }
        }
        if(pend == 0) return 0;
        int[][] dir = {{-1,0},{0,-1},{1,0},{0,1}};
        int ans=-1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
                int[] cur = q.poll();
                int r = cur[0];
                int c = cur[1];
                for(int[] d:dir){
                    int newrow = r+d[0];
                    int newcol = c+d[1];
                    if(rows>newrow && newrow >=0 && cols>newcol && newcol>=0 && 
                    grid[newrow][newcol] == 1){
                        grid[newrow][newcol] = 2;
                        pend--;
                        q.offer(new int[]{newrow,newcol});
                    }
                }
            }
            ans++;
        }
        return (pend == 0) ? ans:-1;
    }
}