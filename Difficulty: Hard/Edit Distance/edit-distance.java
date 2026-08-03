class Solution {

    public static int solve(String s1, String s2, int i,int j,int[][] dp){
        if(i==s1.length()) return s2.length()-j;
        if(j==s2.length()) return s1.length()-i;
        if (s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = solve(s1,s2,i+1, j+1,dp);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int com = 1+solve(s1,s2,i+1,j+1,dp);
        int l  =1+solve(s1,s2,i+1,j,dp);
        int r= 1+solve(s1,s2,i,j+1,dp);
        return dp[i][j]= Math.min(com,Math.min(l,r));
    } 
    public static int editDistance(String s1, String s2) {
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        
        return solve(s1,s2,0,0,dp);
    }
}