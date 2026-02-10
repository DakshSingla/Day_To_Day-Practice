class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return most(nums,k)-most(nums,k-1);
    }
    public int most(int[] nums, int k){
        int n = nums.length;
        int i = 0;
        int j = 0;
        int count = 0;
        int sum = 0;
        while(j<n){
            sum+= nums[j]%2;
            while(sum>k){
                sum-=nums[i]%2;
                i++;
            }
            count+= (j-i+1);
            j++;
        }
        return count;

    }
}