class Solution {
    public String getPermutation(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] v = new boolean[n];
        solve(ans,temp,n,v);
        List<Integer> list = ans.get(k -1);        
        StringBuilder st = new StringBuilder();
        for(int num: list){
            st.append(num);
        }
        return st.toString();
    }
    public void solve(List<List<Integer>> ans, List<Integer> sub, int n,boolean[] v){
        if(sub.size() == n){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i = 0;i<n;i++){
            if(v[i]){
                continue;
            }
            sub.add(i+1);
            v[i]=true;
            solve(ans, sub,n,v);
            sub.remove(sub.size()-1);
            v[i]=false;

        }
    }
}