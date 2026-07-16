class Solution {
	int maxSubarraySum(int[] arr) {
		// Codeint
		int ans = arr[0];
		int sum = arr[0];
		for (int i = 1; i<arr.length; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			ans = Math.max(ans, sum);
		}
		
		return ans;
		
	}
}
