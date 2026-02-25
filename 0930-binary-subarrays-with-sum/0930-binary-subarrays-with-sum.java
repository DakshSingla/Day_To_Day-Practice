class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int temp = goal;
            for(int j = i;j<n;j++){
                if(temp>=0){
                    temp -= nums[j];
                    if(temp==0){
                        count++;
                    }
                }
                else break;
            }
        }
        return count;
    }
}