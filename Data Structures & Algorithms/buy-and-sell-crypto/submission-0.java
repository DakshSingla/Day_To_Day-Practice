class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxi = 0;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int sub = prices[j]-prices[i];
                if(sub>0){
                    maxi = Math.max(maxi,sub);
                }
            }
        }
        return maxi;
    }
}
