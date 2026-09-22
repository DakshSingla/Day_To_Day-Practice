class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int i = 0, j = 0;
        int maxi = Integer.MIN_VALUE;
        int ans = 0;
        while(j<s.length()){
            freq[s.charAt(j)-'A']++;
            maxi = Math.max(maxi,freq[s.charAt(j)-'A']);
            if((j-i+1)-maxi<=k){
                ans = Math.max(ans,j-i+1);
                j++;
            }
            else{
                freq[s.charAt(i)-'A']--;
                i++;
                j++;
            }    
        }
        return ans;
    }
}
