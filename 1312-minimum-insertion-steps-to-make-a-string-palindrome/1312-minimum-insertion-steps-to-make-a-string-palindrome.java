class Solution {
    Integer[][] dp;
    public int minInsertions(String s) {
        dp = new Integer[s.length()][s.length()];
        return rev(s,0,s.length()-1);
    }
    public int rev(String s, int i , int j){
        if(i>=j) return 0;
        if(dp[i][j] !=null) return dp[i][j];
        if(s.charAt(i) == s.charAt(j)){
            return dp[i][j]= rev(s, i+1, j-1);
        }
        return dp[i][j]= 1 + Math.min(rev(s,i+1,j), rev(s,i,j-1));
    }
}