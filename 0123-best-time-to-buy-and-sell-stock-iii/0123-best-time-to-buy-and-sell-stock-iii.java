class Solution {
    public int maxProfit(int[] prices) {
        int buy1 = Integer.MAX_VALUE,buy2 = Integer.MAX_VALUE;
        int p1 = 0,p2=0;
        for(int p:prices){
            buy1 = Math.min(buy1,p);
            p1 = Math.max(p1,p-buy1);
            buy2=  Math.min(buy2,p-p1);
            p2 = Math.max(p2,p-buy2);
        }
        return p2;
    }
}