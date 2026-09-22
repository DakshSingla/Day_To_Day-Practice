class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int mh = Math.min(heights[i],heights[j]);
                int multi = mh*(j-i);
                maxi = Math.max(maxi,multi);
            }
        }
        return maxi;
    }
}
