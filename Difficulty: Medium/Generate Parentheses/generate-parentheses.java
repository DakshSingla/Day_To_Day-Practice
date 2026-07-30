class Solution {
    public void solve(ArrayList<String> ans, String cur, int open, int close, int n){
        if(cur.length() == 2*n){
            ans.add(cur);
            return;
        }
        if(open<n){
            solve(ans,cur+'(',open+1,close,n);
        }
        if(close<open){
            solve(ans,cur+')',open,close+1,n);
        }
    }
    public ArrayList<String> generateParentheses(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        
        solve(ans,"",0,0,n/2);
        return ans;
    }
}