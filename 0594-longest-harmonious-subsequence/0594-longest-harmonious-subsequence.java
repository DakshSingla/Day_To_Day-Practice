class Solution {
    public int findLHS(int[] nums) {
       Arrays.sort(nums);
       int ans = 0;
       int i = 0;
       int j  =0;
       int n = nums.length;
       while(j<n){
        while(nums[j]-nums[i] >1){
            i++;
        }
        if(nums[j]-nums[i] ==1){
            ans = Math.max(ans,j-i+1);
        }
            j++;
       }
       return ans;
    }
}