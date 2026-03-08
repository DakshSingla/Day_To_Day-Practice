class Solution {
    public long subArrayRanges(int[] nums) {
        long sum = 0;
        for(int i = 0;i<nums.length;i++){
            int mini = nums[i];
            int maxi = nums[i];
            for(int j = i;j<nums.length;j++){
                mini = Math.min(nums[j],mini);
                maxi = Math.max(nums[j],maxi);
                sum +=Math.abs(maxi-mini);
            }
        }
        return sum;

    }
}