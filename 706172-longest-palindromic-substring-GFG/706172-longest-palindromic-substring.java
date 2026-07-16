class Solution {
    public boolean palin(String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public String getLongestPal(String s) {
        // code here
        int n = s.length();
        if(n== 1) return s;
        String ans = "";
        for(int i = 0;i<n-1;i++){
            for(int j = n-1;j>=i;j--){
                if (n - i <= ans.length()) break;
                if(s.charAt(i)==s.charAt(j)){
                    if(palin(s,i,j)){
                        if(j -i+1> ans.length()){
                            ans = s.substring(i,j+1);
                        }
                    }
                    //break;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna