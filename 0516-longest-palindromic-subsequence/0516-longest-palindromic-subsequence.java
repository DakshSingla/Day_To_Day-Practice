class Solution {
    int[][] dp;

    public int longestPalindromeSubseq(String s) {
        int j = s.length()-1;
        int i = 0;
        dp = new int[j+2][j+2];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return rec(s,i,j);
    }
    int rec(String s, int i , int j){
        if(i>j) return 0;
        if(i==j) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)== s.charAt(j)) return dp[i][j]=2+rec(s,i+1,j-1);
        return dp[i][j]=Math.max(rec(s,i+1,j),rec(s,i,j-1));
    }
}