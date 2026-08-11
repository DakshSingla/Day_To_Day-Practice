class Solution {
    public int check(int[][] dp, String s1, String s2){
        if(s1.length()==0|| s2.length()==0) return 0;
        for(int i = 1;i<=s2.length();i++){
            for(int j = 1;j<=s1.length();j++){
                if(s2.charAt(i-1) == s1.charAt(j-1))
                    dp[i][j] = 1+dp[i-1][j-1];
                else 
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s2.length()][s1.length()];
    }
    public int lcs(String s1, String s2) {
        // code here
        int[][] dp = new int[s2.length()+1][s1.length()+1];
        // for(int[] arr:dp){
        //     Arrays.fill(arr,0);
        // }
        return check(dp,s1,s2);
        
        
    }
}