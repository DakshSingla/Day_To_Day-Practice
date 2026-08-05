class Solution {
    public static boolean check(int[] arr, int i,int remain,int[][] dp){
        if(remain == 0) return true;
        if(i==arr.length) return false;
        if(remain<0) return false;
        if(dp[i][remain] != -1) return dp[i][remain] ==1; 
        boolean take = check(arr,i+1,remain-arr[i],dp);
        boolean nottake = check(arr,i+1,remain,dp);
        boolean ans = take||nottake;
        dp[i][remain] = ans?1:0;
        return ans;
    }
    static boolean isSubsetSum(int arr[], int sum) {
        // code here
        int[][] dp = new int[arr.length][sum+1];
        for(int[] a:dp)
            Arrays.fill(a,-1);
        return check(arr,0,sum,dp);
    }
}