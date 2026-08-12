class Solution {
    public int check(int n,int k,int[] dp){
        if(n==1) return k;
        if(n==2) return k*k;
        if(dp[n] != -1){
            return dp[n];
        }
        // int c1 = check(n-1,k,dp)*(k-1);
        // int c2 = check(n-2,k,dp)*(k-1);
        dp[n] = (k-1)*(check(n-1,k,dp)+check(n-2,k,dp));
        
        //dp[n] = (check(n-1,k,dp)*(k-1))+ (check(n-2,k,dp)*(k-1));
        return dp[n];
    }
    public int countWays(int n, int k) {
        // code here.
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return check(n,k,dp);
        
    }
}
