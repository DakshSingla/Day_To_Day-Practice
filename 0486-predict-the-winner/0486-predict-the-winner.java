class Solution {
    public int check(int[] nums,int i , int j){
        if (i == j)
            return nums[i];
        int left = nums[i] -check(nums, i + 1, j);
        int right = nums[j]- check(nums, i, j - 1);
        return Math.max(left, right);
    }
    public boolean predictTheWinner(int[] nums) {
        return check(nums,0,nums.length-1)>=0;
    }
}