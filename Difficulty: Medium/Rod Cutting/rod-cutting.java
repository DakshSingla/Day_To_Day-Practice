class Solution {
    public static int cut(int[] arr,int n,int[]dp){
        if(n==0) return 0;
        int maxi = 0;
        if(dp[n] != 0) return dp[n];
        for(int i = 0;i<n;i++){
            maxi= Math.max(maxi,arr[i]+cut(arr,n-(i+1),dp));
            
        dp[n]=maxi;
        }
        return dp[n];
    }
    public int cutRod(int[] price) {
        // code hereint[pri]
        int[] dp = new int[price.length+1];
        Arrays.fill(dp,0);
        return cut(price,price.length,dp);
        
    }
    
}