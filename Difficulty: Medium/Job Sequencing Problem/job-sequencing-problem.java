class Solution {
    int[] slot;
    public int find(int x){
        if(slot[x]==x)
            return x;
        return slot[x]=find(slot[x]);
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        int n = profit.length;
        int[][] dp = new int[n][2];
        for(int i = 0;i<n;i++){
            dp[i][0] = deadline[i];
            dp[i][1] = profit[i];
        }
        Arrays.sort(dp, (a, b)->Integer.compare(b[1],a[1]));
        int maxi = 0;
        for(int i = 0;i<n;i++){
            maxi = Math.max(maxi,dp[i][0]);
        }
       slot = new int[maxi+1];
        for(int i=0;i<=maxi;i++){
            slot[i]=i;
        }
        int count = 0;
        int total = 0;
        for(int i=0;i<n;i++){
            int dead  =find(dp[i][0]);
                if (dead > 0) {
                count++;
                total += dp[i][1];
                slot[dead] = find(dead - 1);
            }
        }
        ans.add(count);
        ans.add(total);
        return ans;
        
    }
}