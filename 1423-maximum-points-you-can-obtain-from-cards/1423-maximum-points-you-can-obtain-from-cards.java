class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxi = 0;
        for(int i = 0;i<k;i++){
            lsum += cardPoints[i];
        }
        maxi = lsum;
        int ri = cardPoints.length -1;
        for(int i = k-1;i>=0;i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[ri];
            ri--;
            maxi = Math.max(maxi,lsum+rsum);
        }
        return maxi;
    }
}