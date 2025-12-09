class Solution {
    int[][] dp;
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[]  arr = new int[n+2];
        arr[0] = 1;
        arr[n+1]=1;
        for(int i = 0;i<n;i++){
            arr[i+1] = nums[i];
        }
        dp = new int[n + 2][n + 2];
        return mcm(arr,1,n);
    }
    int mcm(int[] arr,int i ,int j){
        if(i>j) return 0;
        if (dp[i][j] != 0) return dp[i][j];

        int ans = 0;
        for(int k=i;k<=j;k++){
            int c1 = mcm(arr,i,k-1);
            int c2 = mcm(arr,k+1,j);
            int c3 = arr[i-1] *arr[k]*arr[j+1];
            int tc = c1+c2+c3;
            ans = Math.max(tc,ans);
        }
        dp[i][j] = ans;
        return ans;
    }
}