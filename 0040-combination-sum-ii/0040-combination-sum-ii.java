class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        check(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void check(int idx, int[] arr, int target, List<Integer> ds, List<List<Integer>>ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i<arr.length;i++){
            if(i>idx && arr[i] == arr[i-1]) continue;
            if(arr[i] > target) break;
            ds.add(arr[i]);
            check(i+1, arr, target - arr[i], ds, ans);
            ds.remove(ds.size()-1);
        }
        
    }
}