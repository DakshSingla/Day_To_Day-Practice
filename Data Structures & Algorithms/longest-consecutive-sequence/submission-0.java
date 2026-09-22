class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxi = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int count = 1;
            int a = 1;
            for(int j = i+1;j<n;j++){
                if(nums[j]==nums[i]+a){
                    count++;
                    a++;
                }
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;
    }
}
