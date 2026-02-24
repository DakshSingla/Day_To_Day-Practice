class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxi  = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int a = k;
            int count  = 0;
            for(int j = i;j<n;j++){
                if(nums[j]==1){
                    count++;
                }
                else if(a>0){
                    a--;
                    count++;
                }else break;
            }
            maxi = Math.max(maxi,count);
        }
        return maxi;   
    }
}