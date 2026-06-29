class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        mark(candidates,target,new ArrayList<>(),0,0);
        return ans;
    }
    public void mark(int[] arr, int t,List<Integer> subl,int idx, int sum){
        if(sum== t){
            ans.add(new ArrayList<>(subl));
            return;
        }
        if(sum>t || idx>=arr.length) return;
        subl.add(arr[idx]);
        mark(arr,t,subl,idx,sum+arr[idx]);
        subl.remove(subl.size()-1);
        mark(arr,t,subl,idx+1,sum);
    }
}