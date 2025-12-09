class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int index = 0;
        for(int i = 1;i<=n;i++){
            while(index<n && nums[index] <i){
                index++;
            }
            if(index==n||nums[index] != i){
                ans.add(i);
            }
        }
        return ans;
    }
}