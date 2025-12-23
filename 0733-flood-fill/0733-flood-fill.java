class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image[sr][sc];
        if(color == n) return image;
        dfs(image,sr,sc,color,n);
        return image;
    }
    void dfs(int[][] image,int r,int c,int col,int n){
        if(r<0||c<0||r>=image.length||c>=image[0].length) return;
        if(image[r][c] != n) return;
        image[r][c] = col;
        
        dfs(image,r-1,c,col,n);
        dfs(image,r+1,c,col,n);
        dfs(image,r,c+1,col,n);
        dfs(image,r,c-1,col,n);
    }
}