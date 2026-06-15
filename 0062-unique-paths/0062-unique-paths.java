class Solution {
    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i = 0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return path(0,0,m-1,n-1);
    }
    public int path(int i , int j , int m, int n){
        if(i> m || j>n) return 0;
        if(i== m && j==n) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        int right = path(i,j+1,m,n);
        int down = path(i+1,j,m,n);
        dp[i][j] = right+down;
        return dp[i][j];
    }
}