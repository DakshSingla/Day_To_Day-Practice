class Solution {
    public class pair{
        int r;
        int c;
        pair(int r , int c){
            this.r = r;
            this.c = c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int pend = 0;
        Queue<pair> q = new LinkedList<>();
        for(int i = 0;i<rows;i++){
            for(int j = 0;j<cols;j++){
                if(grid[i][j] == 1){
                    pend++;
                }
                if(grid[i][j]==2){
                    q.add(new pair(i,j));
                }
            }
        }
        if(pend == 0) return 0;
        int[][] dir = new int[][]{
            {-1,0},{1,0},{0,-1},{0,1}
        };
        int ans=-1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0;i<size;i++){
            pair cur = q.poll();
            for(int[] d:dir){
                int nr = cur.r+d[0];
                int nc = cur.c+d[1];
                if(nr>=0 && nr <rows && nc >=0&& nc<cols && grid[nr][nc]==1){
                    grid[nr][nc] = 2;
                    q.add(new pair(nr,nc));
                    pend--;
                }
            }}
            ans++;
        }
        return (pend == 0)? ans:-1;

    }
}