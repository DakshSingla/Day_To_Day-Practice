class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        check(0 , nums, new ArrayList<>(),ans);
        return ans;
    }
    public void check(int idx, int[] arr, List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i = idx; i < arr.length; i++){
            if(i > idx && arr[i] == arr[i-1]) continue;
            temp.add(arr[i]);
            check(i + 1, arr, temp, ans);
            temp.remove(temp.size() - 1);
        }

    }
}