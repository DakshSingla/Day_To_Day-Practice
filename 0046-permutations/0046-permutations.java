class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        helper(nums,new ArrayList<>());
        return ans;
    }
    void helper(int[] nums, List<Integer> temp){
        if(temp.size() == nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            helper(nums,temp);
            temp.remove(temp.size()-1);
        }
    }
}