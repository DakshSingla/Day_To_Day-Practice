class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        for(int i = 1;i<nums.length;i++){
            int aa = nums[i-1]+1;
            while(aa<nums[i]){
                ans.add(aa);
                aa++;
            }
        }
        return ans;
    }
}