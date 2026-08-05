class Solution {
    public static int check(int[] arr, int sum, int i,int[][] dp ){
        if(i>=arr.length) return 0;
        if(sum == 0) return 1;
        if(sum<0)return 0;
        if(dp[i][sum] != -1) return dp[i][sum];
        int take= check(arr,sum-arr[i],i,dp);
        int skip = check(arr,sum,i+1,dp);
        return dp[i][sum]=take+skip;
    }
    public int count(int coins[], int sum) {
        // code here.
        int[][] dp = new int[coins.length][sum+1];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
        return check(coins,sum, 0,dp);
    }
}