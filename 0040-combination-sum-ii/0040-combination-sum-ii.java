class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,new ArrayList<>(),candidates,target,0);
        return ans;
    }
    public void solve(List<List<Integer>> ans,List<Integer> sub, int[] arr, int t,int idx){
        if(t == 0){
            ans.add(new ArrayList<>(sub));
            return;
        }
        for(int i = idx;i<arr.length;i++){
            if(i>idx&&arr[i] == arr[i-1]) continue;
            if(arr[i] > t) break;
            sub.add(arr[i]);
            solve(ans,sub,arr,t-arr[i],i+1);
            sub.remove(sub.size()-1);
        }
    }
}