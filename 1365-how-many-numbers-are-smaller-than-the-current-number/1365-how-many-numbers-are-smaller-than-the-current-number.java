class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int n = nums.length;
        int[] ans = new int[n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        return ans;
    }
}