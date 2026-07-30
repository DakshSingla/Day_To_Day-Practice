class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int W) {
        // code here
        double[][] map = new double[val.length][3];
        for(int i = 0;i<val.length;i++){
            map[i][0] = val[i];
            map[i][1] = wt[i];
            map[i][2] = (double)val[i]/wt[i];
        }
        Arrays.sort(map,(a,b)-> Double.compare(b[2],a[2]));
        double ans =0;
        for(int i = 0;i<val.length;i++){
            if(map[i][1] <= W){
                ans+=map[i][0];
                W-=(int)map[i][1];
            }
            else{
                ans += map[i][2] * W;
                break;
            }
        }
        return ans;
        
    }
}
