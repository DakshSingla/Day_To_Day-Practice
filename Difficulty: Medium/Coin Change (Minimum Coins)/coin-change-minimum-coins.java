class Solution {
	static int inf = (int)1e9;
	public static int check(int[] arr, int sum, int i,int[][] dp) {
		if (i == arr.length - 1) {
			if (sum % arr[i] == 0)
				return sum/arr[i];
			return inf;
		}
		if(dp[i][sum]!= -1) return dp[i][sum];
		int skip = check(arr, sum, i + 1,dp);
		int take = inf;
		if (arr[i] <= sum) {
			take = 1 + check(arr, sum-arr[i], i,dp);
			
		}
		return dp[i][sum]=Math.min(take, skip);
	}
	public int minCoins(int coins[], int sum) {
		// code here
		int[][] dp = new int[coins.length][sum+1];
		for(int[] a:dp){
		    Arrays.fill(a,-1);
		}
		int ans = check(coins, sum, 0, dp);
		return ans >= inf ? -1 : ans;
		
	}
}
