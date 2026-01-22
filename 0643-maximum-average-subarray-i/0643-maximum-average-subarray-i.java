class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = i;
        int sum=0;        
        int maxi = 0;  
        while(j<k){
            sum+= nums[j];
            j++;

        }
        maxi = sum;
        while(j<n){
            sum+=nums[j];
            sum-=nums[i];
            i++;
            j++;
            maxi = Math.max(maxi,sum);
        }
        return (double) maxi/k;
    }
}