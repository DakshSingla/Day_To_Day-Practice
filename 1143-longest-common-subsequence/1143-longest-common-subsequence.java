class Solution {
    int[][] dp;
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        dp = new int[m][n];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return lsc(text1,text2,m-1,n-1);
        
    }
    int lsc(String t1,String t2, int i,int j){
        if(i<0||j<0) return 0;

        if(dp[i][j]!= -1) return dp[i][j];
        if(t1.charAt(i)==t2.charAt(j)) return dp[i][j]=1+lsc(t1,t2,i-1,j-1);

        return dp[i][j]=Math.max(
            lsc(t1,t2,i,j-1),
            lsc(t1,t2,i-1,j)
        );
    }
}