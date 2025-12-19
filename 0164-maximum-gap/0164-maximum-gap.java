class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = 0;
        for(int i =1;i<n;i++){
            ans = Math.max(ans,nums[i]-nums[i-1]);
        }
        return ans;
    }
}