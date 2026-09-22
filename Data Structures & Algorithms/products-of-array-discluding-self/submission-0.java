class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        for(int i = 0;i<n;i++){
            int p = 1;
            for(int j = 0;j<n;j++){
                if(i==j) continue;
                p*=nums[j];
                
            }
            out[i] = p;
        }
        return out;
    }
}  
