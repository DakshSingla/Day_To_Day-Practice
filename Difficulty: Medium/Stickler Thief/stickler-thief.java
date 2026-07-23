class Solution {
    public int solve(int[] arr,int i,int[] dp){
        if(i>= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int pick = arr[i]+solve(arr,i+2,dp);
        int notpick = solve(arr,i+1,dp);
        return dp[i]=Math.max(pick,notpick);
    }
    public int findMaxSum(int arr[]) {
        // code here
        int[] dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return solve(arr,0,dp);
    }
}