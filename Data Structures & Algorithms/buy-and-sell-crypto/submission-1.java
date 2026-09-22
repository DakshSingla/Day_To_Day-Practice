class Solution {
    public int maxProfit(int[] prices) {
        int minv = Integer.MAX_VALUE;
        int maxi = 0;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<minv){
                minv = prices[i];
            }
            else
            maxi = Math.max(maxi,prices[i]-minv);
        }
        return maxi;
    }
}
