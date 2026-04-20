class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0, -1, nums,dp);
    }
    public int f(int idx, int preidx, int[]arr, int[][] dp){
        if(idx == arr.length){
            return 0;
        }
        if(dp[idx][preidx+1] != -1){
            return dp[idx][preidx+1];
        }
        int pick = 0;
        if(preidx ==-1 || arr[idx] > arr[preidx]){
            pick = 1 + f(idx +1, idx,arr,dp);
        }
        int notpick = f(idx+1, preidx,arr, dp);
        return dp[idx][preidx+1] = Math.max(pick, notpick);
    }
}